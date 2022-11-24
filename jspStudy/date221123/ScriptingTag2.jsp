<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tag</title>
</head>
<body>
	<%-- 선언문 태그 사용 예 : 전역변수 선언 --%>
	<%!
		int count = 0; // 전역변수 count를 0으로 초기화
	%>
	page Count is
	<%
		out.println(++count); // 전역변수 1 증가. 새로 고침을 하면 숫자가 증가
	%>
	<%-- 스크립틀릿의 차이 : 지역변수 선언 --%>
	<% int count = 0; %>
	<br>
	Page Count-2 is
	<%-- 지역변수 count를 1 증가시킴 --%> 
	<%=++count%>
</body>
</html>