<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Method</title>
</head>
<body>
	Page Count is 
	<%-- 선언문 태그 사용 예 : 전역 메소드 선언 --%>
	<%-- 스크립틀릿 태그 --%>
	<%
		out.println(myMethod(0)); // 전역 메소드 myMethod() 호출
	%>
	<br>
	<%
		out.println("2 + 3 = " + sum(2,3)); // 전역 메소드 sum() 호출
	%>
	<%!
		// 전역 메서드 설정
		public int myMethod(int count){
			return ++count;
		}
		int sum(int a, int b){
			return a+b;
		}
	%>
</body>
</html>