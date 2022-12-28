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
	boolean loginState = false;
	String userID = null;
	Cookie[] cookies = request.getCookies();
	for(int i=0; i<cookies.length; i++){
		if(cookies[i].getName().equals("userID") && cookies[i].getValue() != null){
			loginState = true;
			userID = cookies[i].getValue();
		}
	}
	if(loginState){
		out.println("<h2>" + userID + "님 반갑습니다.</h2>");
		out.println("<a href='Ex_logout_cookie.jsp'>로그아웃</a>");
	}
	%>
</body>
</html>