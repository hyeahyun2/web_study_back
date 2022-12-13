<%@ page import="java.sql.*" %>

<%-- DB 연결 --%>
<%
Connection conn = null;
try{
	String url = "jdbc:mariadb://localhost:3306/MyStudy";
	String user = "root";
	String password ="6995";
	
	try{
		Class.forName("org.mariadb.jdbc.Driver");
	} catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	conn = DriverManager.getConnection(url, user, password);
	
} catch(SQLException ex){
	out.println("데이터베이스 연결이 실패되었습니다.<br>");
	out.println("SQLException" + ex.getMessage());
}
%>