<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 저장 완료</title>
</head>
<body>
	<h1>학생 정보 저장 완료</h1>
	<%
	request.setCharacterEncoding("utf-8");
	int number = Integer.parseInt(request.getParameter("number"));	
	String name = request.getParameter("name");
	String major = request.getParameter("major");
	
	// mariaDB 준비
	Class.forName("org.mariadb.jdbc.Driver");
	System.out.println("mariaDB사용가능");
	
	// mariaDB 연결
	Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306","root", "6995");
	System.out.println(conn + "<-- conn");
	
	// 쿼리
	PreparedStatement stmt = conn.prepareStatement("insert into test(number, name, major) values(?,?,?)");
	stmt.setInt(1, number);
	stmt.setString(2, name);
	stmt.setString(3, major);
	System.out.println(stmt + "<--stmt");
	
	// 쿼리 실행
	stmt.executeUpdate();
	conn.close();
	%>
</body>
</html>