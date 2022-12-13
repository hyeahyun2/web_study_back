<%@ page import="java.sql.*" %>
<%@ include file="conn_db.jsp" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>

<%
/* 전달 받을 값 : 아이디(memberId) */
request.setCharacterEncoding("utf-8");
String memberId = request.getParameter("memberId");

String tableName = "user";
Statement statement = null;

// 초기화
boolean state = false;
int res = 0;
try {
	String sql = "SELECT COUNT(*) AS cnt FROM " + tableName + " WHERE memberId = '"
			+ memberId + "'";
	
	statement = conn.createStatement();
	ResultSet resultSet = statement.executeQuery(sql); // 쿼리 실행
	resultSet.next(); // 한칸 뒤로 옮겨주기
	res = resultSet.getInt("cnt"); // 카운트한 값 넣어주기
} catch(Exception e){
	e.printStackTrace();
}
if(statement != null){
	statement.close();
}
if(conn != null){
	conn.close();
}

if(res != 0) state = true; // 중복 있으면 -> true
%>
<%-- 저장받은 db값을 json형식으로 출력(저장) --%>
{"memberId" : <%= memberId %>, "state" : <%= state %> }