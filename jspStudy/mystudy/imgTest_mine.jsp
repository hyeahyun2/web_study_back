<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/imgTest_mine.js" defer></script>
<style>
    li {
      list-style: none;
    }

    img {
      width: 200px;
      height: 200px;
    }

    .image-preview {
      width: 200px;
      height: 200px;
      background-color: aquamarine;
      display: flex;
      gap: 20px;
    }
  </style>
</head>

<body>
	<form action="#" enctype="multipart/form-data" method="POST" name="imgUpload">
		<input type="file" class="real-upload" accept="image/*" required multiple>
	</form>
	<div class="image-preview"></div>
</body>
</html>