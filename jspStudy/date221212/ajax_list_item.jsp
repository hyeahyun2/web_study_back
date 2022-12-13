<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ include file="conn_db.jsp" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%-- 데이터베이스에서 완료 체크가 안된 (isChecked = 'false') 데이터를 최신 등록일 순서로 가지고 옴 
호출한 쪽에 json
--%>
{ "listData" : [
	<%
	request.setCharacterEncoding("utf-8");
	String item = request.getParameter("item");
	String tableName = "todo_list";
	
	Statement statement = null;
	
	String sql = "SELECT * FROM " + tableName + 
			" WHERE isChecked = 'false' ORDER BY num";
	
	try {
		statement = conn.createStatement();
	} catch(SQLException e){
		e.printStackTrace();
	}
	
	ResultSet resultSet = null;
	try {
		resultSet = statement.executeQuery(sql);
	} catch(SQLException e){
		e.printStackTrace();
	}
	while(resultSet.next()){
	%>
	{"item" : "<%=resultSet.getString("item")%>", "num" : <%=resultSet.getInt("num")%>}
	<%
		if(!resultSet.isLast()){
			out.print(", ");
		}
	}
	if(resultSet != null) resultSet.close();
	if(statement != null) statement.close();
	if(conn != null) conn.close();
	%>
]}