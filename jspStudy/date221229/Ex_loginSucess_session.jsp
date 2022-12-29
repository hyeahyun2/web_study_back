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
	String userID = (String)session.getAttribute("userID");
	if(userID == null || userID.equals("")){
		response.sendRedirect("Ex_login_session.jsp");
	}
	else {
		out.println(userID + "님 반갑습니다.<br>");
	}
	%>
	<a href="Ex_logout_session.jsp">로그아웃</a>
</body>
</html>