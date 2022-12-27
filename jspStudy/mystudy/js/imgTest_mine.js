// 파일 업로드
/*
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
		
		// 비동기통신
		const xhr = new XMLHttpRequest();
		const realUpload = document.querySelector('.real-upload');
		
		const saveImg = function(e){
			var form = new FormData();
			form.append("file1", realUpload.files);
			
			let uploadFile = realUpload.value; // userID 값 가져오기
			console.log(uploadFile);
			xhr.open("POST", "./imgTest_action.jsp", true);
			//xhr.setRequestHeader("인코딩?방식", ""); 
			xhr.setRequestHeader("Content-type","multipart/form-data");
			
			xhr.onreadystatechange = function(){
				if(xhr.readyState != XMLHttpRequest.DONE) return;
				console.log("test");
				if(xhr.status == 200){ // 준완
					getImageFiles(e);
				}
			}
			xhr.send(form); // header에 포함하고자 하는 key와 값
		}
		
		realUpload.addEventListener('change', (e)=>{
			saveImg(e);
		});
		
		*/

const form = document.imgUpload;