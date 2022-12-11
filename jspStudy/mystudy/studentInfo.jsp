<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력</title>
</head>
<body>
	<h1>학생 정보 입력</h1>
	<form action="studentInfo_insert.jsp" name="info">
		<p> 학번 : <input type="text" name="number"></p>
		<p> 이름 : <input type="text" name="name"></p>
		<p> 전공 : <input type="text" name="major"></p>
		<input type="submit" value="추가">
	</form>
</body>
</html>