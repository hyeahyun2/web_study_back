const form = document.member_insert;
const submitBtn = form.submitBtn;
console.log(submitBtn);

// 유효성 검사
submitBtn.addEventListener("click", function(){
  let idValue = form.memberID.value;
  let pwValue = form.passwd.value;
  let pwChackValue = form.passwdCheck.value;
  let nameValue = form.memberName.value;

  //아이디 입력 확인
  if(idValue.length == 0){
    alert("아이디를 입력해주세요.");
    form.memberID.select();
    return;
  }
  // 비번 입력 확인
  if(pwValue.length == 0){
    alert("비밀번호를 입력해주세요.");
    form.passwd.select();
    return;
  }
  // 비밀번호와 비밀번호 확인 다를 경우
  if(pwValue != pwChackValue){
    alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
    form.passwdCheck.select();
    return;
  }
  // 이름 입력 확인
  if(nameValue.length == 0){
    alert("이름 입력해주세요.");
    form.memberName.select();
    return;
  }
  // action 경로
  form.action = "member_insert_action.jsp";
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