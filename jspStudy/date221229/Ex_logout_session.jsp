<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Enumeration<String> en = session.getAttributeNames();
	while(en.hasMoreElements()){
		String sName = en.nextElement().toString();
		session.removeAttribute(sName);
	}
	response.sendRedirect("Ex_login_session.jsp");
	%>
</body>
</html>