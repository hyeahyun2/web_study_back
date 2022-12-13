<%@ page import="java.sql.*" %>
<%@ include file="conn_db.jsp" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>

<%
/* 전달 받은 글을 저장하고, 저장된 열의 num(자동증가값, 데이터의 식별자)를 json으로 전달.*/
request.setCharacterEncoding("utf-8");
int num = Integer.parseInt(request.getParameter("num"));

String tableName = "todo_list";
Statement statement = null;
String sql = "UPDATE " + tableName + " SET isChecked = 'true' WHERE num = "
		+ num;

statement = conn.createStatement();
int resultInt = statement.executeUpdate(sql); // 쿼리 실행

if(statement != null){
	statement.close();
}
if(conn != null){
	conn.close();
}
%>
<%-- 저장받은 db값을 json형식으로 출력(저장) --%>
{ "delete" : "true", "num" : <%= num %> }