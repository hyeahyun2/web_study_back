<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<%!
	String hello = "Hello, Java Server Pages";
	public String getString(){
		return hello;
	}
	%>
	<h1><%=getString()%></h1>
</body>
</html>