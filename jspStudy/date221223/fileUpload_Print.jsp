<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
	<!-- 이미자 파일 업로드 후 출력하기 -->
	<form name="frmUpload" method="post" action="fileUpload_print_action.jsp" enctype="multipart/form-data">
		<p>이미지 : <input type="file" name="img"></p>
		<p> <input type="submit" value="등록"></p>
	</form>
</body>
</html>