<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<input type="file" class="real-upload" accept="image/*" required multiple>
	<div class="image-preview"></div>
	<script>
		// 파일 업로드
		function getImageFiles(e) {
			const uploadFiles = [];
			const files = e.currentTarget.files;
			const imagePreview = document.querySelector('.image-preview');
			const docFrag = new DocumentFragment();
			
			imagePreview.innerHTML = null;
			
			[...files].forEach(file => {
				uploadFiles.push(file);
				const reader = new FileReader();
				reader.onload = (e) => {
					const preview = createElement(e, file);
					imagePreview.appendChild(preview);
				};
				reader.readAsDataURL(file);
			});
		}
		
		function createElement(e, file) {
			const img = document.createElement('img');
			img.setAttribute('src', e.target.result);
			img.setAttribute('data-file', file.name);
			
			return img;
		}
		
		const realUpload = document.querySelector('.real-upload');
		
		realUpload.addEventListener('change', (e)=>{
			getImageFiles(e);
		});
	</script>
</body>
</html>