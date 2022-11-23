<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Today's date</title>
</head>
<body>
	<p> Today's date: <%=new java.util.Date() %></p>
	<p> * 스크립틀릿 태그 이용 </p>
	<p> Today: 
	<%
	// Object date = new java.util.Date();
	java.util.Date date = new java.util.Date();
	out.println(date + "<br>");
	java.util.Calendar car = java.util.Calendar.getInstance();
	java.util.Date c = car.getTime();
	out.println(car.getTime());
	%>
	</p>
	Current Time : <%=java.util.Calendar.getInstance().getTime()%>
</body>
</html>