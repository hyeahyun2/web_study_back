<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="Ex_insert_process.jsp">
		<p>학번 : <input type="text" name="num" placeholder="10자로 작성"></p>
		<p>학과 : <input type="text" name="depart"></p>
		<p>이름 : <input type="text" name="name"></p>
		<p>주소 : <input type="text" name="address"></p>
		<p>연락처 : <input type="text" name="phone" placeholder="000-0000-0000"></p>
		<p><input type="submit" value="확인"></p>
	</form>
</body>
</html>