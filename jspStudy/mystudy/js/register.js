// 우편번호 검색
function execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var fullAddr = ''; // 최종 주소 변수
            var extraAddr = ''; // 조합형 주소 변수

            // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                fullAddr = data.roadAddress;
            }
            else { // 사용자가 지번 주소를 선택했을 경우(J)
                fullAddr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
            if(data.userSelectedType === 'R'){
                //법정동명이 있을 경우 추가한다.
                if(data.bname !== ''){
                    extraAddr += data.bname;
                }
                // 건물명이 있을 경우 추가한다.
                if(data.buildingName !== ''){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('zipcode').value = data.zonecode; //5자리 새우편번호 사용
            document.getElementById('address01').value = fullAddr;

            // 커서를 상세주소 필드로 이동한다.
            document.getElementById('address02').focus();
        }
    }).open();
}


// 성별 선택
const form = document.member_insert;
const sexMan = document.getElementById("man");
const manInput = sexMan.querySelector("input");
const sexWoman = document.getElementById("woman");
const womanInput = sexWoman.querySelector("input");

sexWoman.addEventListener("click", (e)=>{ // 여자 선택
	manInput.removeAttribute("checked");
	womanInput.setAttribute("checked", "checked");
	e.currentTarget.style.backgroundColor = "rgb(238, 123, 142)";
	sexMan.style.backgroundColor = "rgb(214, 245, 255)";
})
sexMan.addEventListener("click", (e)=>{ // 남자 선택
	womanInput.removeAttribute("checked");
	manInput.setAttribute("checked", "checked");
	e.currentTarget.style.backgroundColor = "rgb(128, 199, 223)";
	sexWoman.style.backgroundColor = "rgb(255, 224, 229)";
})


// 유효성 검사
const submitBtn = form.submitBtn;
console.log(submitBtn);

submitBtn.addEventListener("click", function(){
  let idValue = form.memberId.value;
  let pwValue = form.password.value;
  let pwChackValue = form.password_cf.value;
  let nameValue = form.name.value;
  let nickValue = form.nickName.value;

  //아이디 입력 확인
  if(idValue.length == 0){
    alert("아이디를 입력해주세요.");
    form.memberId.select();
    return;
  }
  // 비번 입력 확인
  if(pwValue.length == 0){
    alert("비밀번호를 입력해주세요.");
    form.password.select();
    return;
  }
  // 비밀번호와 비밀번호 확인 다를 경우
  if(pwValue != pwChackValue){
    alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
    form.password_cf.select();
    return;
  }
  // 이름 입력 확인
  if(nameValue.length == 0){
    alert("이름 입력해주세요.");
    form.name.select();
    return;
  }
  // action 경로
  form.action = "register_action.jsp";
  form.submit();
});

// 우편번호 검색
const postSearch = form.postSearch;

postSearch.addEventListener("click", function(){
  new daum.Postcode({
    oncomplete: function (data) {
      var fullAddr = ''; // 최종 주소 변수
      var extraAddr = ''; // 조합형 주소 변수

      // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
      if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
        fullAddr = data.roadAddress;
      }
      else { // 사용자가 지번 주소를 선택했을 경우(J)
        fullAddr = data.jibunAddress;
      }

      // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
      if (data.userSelectedType === 'R') {
        //법정동명이 있을 경우 추가한다.
        if (data.bname !== '') {
          extraAddr += data.bname;
        }
        // 건물명이 있을 경우 추가한다.
        if (data.buildingName !== '') {
          extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
        }
        // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
        fullAddr += (extraAddr !== '' ? ' (' + extraAddr + ')' : '');
      }

      // 우편번호와 주소 정보를 해당 필드에 넣는다.
      document.getElementById('zipCode').value = data.zonecode; //5자리 새우편번호 사용
      document.getElementById('address1').value = fullAddr;

      // 커서를 상세주소 필드로 이동한다.
      document.getElementById('address2').focus();
    }
  }).open();
})