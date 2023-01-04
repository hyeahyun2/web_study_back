<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
	<%--
	JDBC API로 데이터베이스 접속하기
	1) Connection 객체를 null로 초기화
	2) 데이터베이스와 연동하기 위해 JDBC를 로딩하도록 Class.forName() 메서드 작석.
	3) DriverManager 객체로부터 Connection 객체를 얻어오도록 getConnection() 메서드 작성
	 --%>
	 
	<%-- include용 파일 --%>
	<%
	Connection conn = null;
	
	String url = "jdbc:mariadb://localhost:3306/studyjdbc";	
	String user = "root";
	String password = "6995";
	
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection(url, user, password);
	%>
	
	<%--
	try{
		String url = "jdbc:mariadb://localhost:3306/studyjdbc";	
		String user = "root";
		String password = "6995";
		
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		out.println("데이터베이스 연결이 성공되었습니다.");
	} catch(SQLException e){
		out.println("데이터베이스 연결이 실패되었습니다. <br>");
		out.println("SQLException : " + e.getMessage());
		e.printStackTrace();
	} finally{
		if(conn != null) conn.close();
	}
	--%>