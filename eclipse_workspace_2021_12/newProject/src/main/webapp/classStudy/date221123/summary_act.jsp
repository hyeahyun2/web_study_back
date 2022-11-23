<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("id");
	String userpw = request.getParameter("passwd");
	
	// 한번에 2개 파라미터 출력 ~
	Enumeration user = request.getParameterNames();
	while(user.hasMoreElements()){
	String Ename = (String)user.nextElement();
	String Evalue = request.getParameter(Ename);
	
	
	%>
	<%=Ename%> : <%=Evalue %> <br>
	<% } %>
	
</body>
</html>