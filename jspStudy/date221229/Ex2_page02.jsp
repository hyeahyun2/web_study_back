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
	if(userID == null || userID.equals("")){ // 비로그인 상태일 때
		response.sendRedirect("Ex2_login.jsp");
	}
	%>
	<h3>회원 전용 페이지 입니다.</h3>
	<a href="Ex2_logout.jsp">로그아웃</a>
</body>
</html>