<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
<style>
	* { margin: 0; padding: 0;}
	ul { list-style: none; }
	body { margin: 20px auto; width: 400px; }
</style>
</head>
<body>
	<div class="insert">
		<form>
			<input type="text" name="item">
			<input type="button" value="등록" id="insertList">
			<input type="button" value="완료목록" id="checkedList">
		</form>
	</div>
	<!-- 목록이 들어갈 부분 -->
	<div id="todo_list">
		<ul>
		</ul>
	</div>
	
	<script>
		document.addEventListener("DOMContentLoaded", function(){
			/* 변수 선언 */
			const xhr = new XMLHttpRequest(); // XMLHttpRequest 객체 생성
			
			/* 함수 선언 */
			// 아이템 추가
			const insertItem = function(num, item){
				/* 목록에 요소를 추가. 처음 로딩시 목록을 출력하거나, 새로운 글 등록시 사용*/
				let tagNew = document.createElement("li");
				tagNew.innerHTML = "<label><input type='checkbox' class='cb' name='" 
							+ num + "' value='"+ num + "'></label> " + item;
				tagNew.setAttribute("class", num);
				// 동적으로 생성된 요소여서 생성시에 이벤트 추가.
				tagNew.querySelector("input[type=checkbox]")
						.addEventListener("click", deleteItem);
				let tagUl = document.querySelector("ul");
				tagUl.prepend(tagNew); // ul태그에 생성한 li태그 추가 (가장 위에)
			}
			
			
			// 로딩시 목록을 가지고 오는 메서드
			const insertList = function(){
				/* 목록을 가지고 옴 */
				xhr.open("GET", "ajax_list_item.jsp");
				xhr.send();
				xhr.onreadystatechange = function(){
					if(xhr.readyState != XMLHttpRequest.DONE) return;
					
					if(xhr.status == 200){ // 서버(url)에 문서가 존재함
						const json = JSON.parse(xhr.response);
						for(let data of json.listData){
							insertItem(data.num, data.item);
						}
					}
					else { // 서버(url)에 문서가 존재하지 않음
						console.error("Error", xhr.status, xhr.statusText);
					}
				}
			}
			
			// 완료 아이템 목록
			const checkedItem = function(num, item){
				/* 목록에 요소를 추가. 처음 로딩시 목록을 출력하거나, 새로운 글 등록시 사용*/
				let tagNew = document.createElement("li");
				tagNew.innerHTML = "<label><input type='checkbox' checked class='cb' name='" 
							+ num + "' value='"+ num + "'></label> " + item;
				tagNew.setAttribute("class", num);
				// 완료 아이템 목록 클릭 시 isChecked가 false로 바뀌는 이벤트 추가하기
				//tagNew.querySelector("input[type=checkbox]")
				//		.addEventListener("click", deleteItem);
				let tagUl = document.querySelector("ul");
				
				tagUl.prepend(tagNew); // ul태그에 생성한 li태그 추가 (가장 위에)
			}
			
			// 버튼 클릭 시 완료된 아이템 로딩하기
			const checkList = function(){
				let tagUl = document.querySelector("ul");
				tagUl.innerHTML = "";
				xhr.open("GET", "ajax_checkList_item.jsp");
				xhr.send();
				xhr.onreadystatechange = function(){
					if(xhr.readyState != XMLHttpRequest.DONE) return;
					
					if(xhr.status == 200){ // 서버(url)에 문서가 존재함
						const json = JSON.parse(xhr.response);
						for(let data of json.listData){
							checkedItem(data.num, data.item);
						}
					}
					else { // 서버(url)에 문서가 존재하지 않음
						console.error("Error", xhr.status, xhr.statusText);
					}
				}
			}
			
			const checkBtn = document.querySelector("#checkedList");
			checkBtn.addEventListener("click", checkList);
			
			// 아이템 삭제
			const deleteItem = function(){
				/* 체크박스 클릭시 실행
				1) 데이터 베이스에서 해당 게시물 삭제 2) 해당 태그 삭제 */
				let item = this;
				let num = item.getAttribute("name");
				xhr.open("GET", "ajax_delete_item.jsp?num=" + num);
				xhr.send();
				xhr.onreadystatechange = function(){
					if(xhr.readyState !== XMLHttpRequest.DONE) return;
					
					if(xhr.status === 200){ // 서버(url)에 문서가 존재함
						const json = JSON.parse(xhr.response);
						if(json.delete === 'true'){
							console.log("delete true : " + json.num);
							// item이 input 태그여서 부모 태그인 li 선택
							const pNode = item.parentNode.parentNode;
							pNode.parentNode.removeChild(pNode); // li 태그 삭제
							// console.log(item.querySelector('input'));
							// console.log(item);
						}
					}
					else {// 서버(url)에 문서가 존재하지 않음
						console.error("Error", xhr.status, xhr.statusText);
					}
				}
			}
			
			insertList();
			
			/* 이벤트 선언 */
			const btn = document.querySelector("#insertList");
			btn.addEventListener("click", function(){
				/* 등록 버튼 클릭 시
				* 1) 데이터베이스에 데이터 등록 2) 화면에 표시*/
				let item = document.querySelector(".insert input[name=item]");
				
				// ajax_insert_itm.jsp 파일에 item.value 값 입력해서 받기
				xhr.open("GET", "ajax_insert_item.jsp?item=" + item.value);
				xhr.send();
				xhr.onreadystatechange = ()=>{
					if(xhr.readyState !== XMLHttpRequest.DONE) return;
					
					if(xhr.status === 200){ // 서버(url)에 문서가 존재할 때
						const json = JSON.parse(xhr.response);
						if(json.insert === 'true'){
							insertItem(json.num, item.value); // 화면에 표시
							item.value=""; // input 태그에 입력된 값 삭제
						}
					}
					else { // 서버(url)에 문서가 존재하지 않음
						console.error('Error', xhr.status, xhr.statusText);
					}
				}
			})
			
			
		})
	</script>
</body>
</html>