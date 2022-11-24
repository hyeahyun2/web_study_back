<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보</title>
</head>
<body>
	<%-- form01_process.jsp --%>
	<%-- form02_process.jsp --%>
	<form action="testDBConnect.jsp" method="post">
		<p> 이름 : <input type="text" name="name">
		<p> 주소 : <input type="text" name="address">
		<p> 이메일 : <input type="text" name="email">
		<p> <input type="submit">
	</form>
</body>
</html>