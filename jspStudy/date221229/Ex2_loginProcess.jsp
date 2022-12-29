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
	String userID = request.getParameter("id");
	String userPW = request.getParameter("pw");
	if(userID.equals("admin") && userPW.equals("1234")){
		session.setAttribute("userID", userID);
		response.sendRedirect("Ex2_page01.jsp");
	}
	%>
</body>
</html>