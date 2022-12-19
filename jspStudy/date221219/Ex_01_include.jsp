<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="./Ex_01_header.jsp" %>
	<%
	Calendar day = Calendar.getInstance();
	%>
	<p>현재 시간 : <%= day.getTime() %></p>
</body>
</html>