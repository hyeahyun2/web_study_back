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
	String userID = request.getParameter("userID");
	String userPW = request.getParameter("userPW");
	if(userID.equals("admin") && userPW.equals("1234")){
		Cookie idCookie = new Cookie("userID", userID);
		response.addCookie(idCookie);
		response.sendRedirect("Ex_loginSuccess_cookie.jsp");
	}
	%>
</body>
</html>