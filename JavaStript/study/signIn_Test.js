function signInFun(){
  const form = document.signIn;
  let id = form.id.value;
  let passwd = form.passwd.value;
  let name = form.name.value;
  let nick = form.nick.value;
  let phone = form.phone1.value + "-" + form.phone2.value + "-" + form.phone3.value;
  let birthday = form.birthday.value;
  // 비번 = 비번확인
  if(form.passwdCheck.value != passwd){
    alert("비밀번호가 일치하지 않습니다. 다시 확인해주세요.");
    form.passwd.select();
    return;
  }

  // 유효성 검사
  // 아이디 : 영문자로 시작하는 영문자 또는 숫자 6~20자
  let regExpId = /^[a-z]+[a-z0-9]{4,19}$/g;
  // 비번 : 최소 8 자, 대문자 하나 이상, 소문자 하나, 숫자 하나 및 특수 문자 하나 이상
  let regExpPasswd = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}/;
  // 이름에 대해 한글만 검사하도록 정규 표현식 작성.
  let regExpName = /^[가-힣]{2,}$/;
  // 별명 : 한글/영문/숫자
  let regExpNick = /^[가-힣|a-z|A-Z]+[가-힣|a-z|A-Z|0-9]*$/;
  // 전화번호 형태
  let regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
  // 날짜
  let regExpBirth = /^\d{1,2}\/\d{1,2}\/\d{2,4}$/;
  if(!regExpId.test(id)){ // 해당 정규표현식 폼에 포함되지 않은 문자가 있는 경우
    alert("아이디 : 영문자로 시작하고, 영문자와 숫자 조합으로 5자이상 20자 이하로 작성");
    form.id.select();
    return;
  }
  if(!regExpPasswd.test(passwd)){
    alert("비밀번호 : 최소 8 자, 대문자 하나 이상, 소문자 하나, 숫자 하나 및 특수 문자 하나 이상");
    form.passwd.select();
    return;
  }
  if(!regExpName.test(name)){
    alert("이름은 한글만으로 입력해 주세요!");
    form.name.select();
    return;
  }
  if(!regExpNick.test(nick)){
    alert("별명은 한글이나 영문으로 시작해야하고, 한글/영문/숫자로 입력 가능합니다");
    form.nick.select();
    return;
  }
  if(!regExpPhone.test(phone)){
    alert("연락처 입력을 확인해 주세요!");
    form.phone.select();
    return;
  }
  if(!regExpBirth.test(birthday)){
    alert("연락처 입력을 확인해 주세요!");
    form.birthday.select();
    return;
  }

  // 데이터 json 형식으로 저장
  const member = {
    id: id,
    passwd: passwd,
    name: name,
    nick: nick,
    sex: form.sex.value,
    birthday: form.birthday.value,
    phone: phone
  };
  // console.log(member);
  const Mjson = JSON.stringify(member, null, 2);
  console.log(Mjson);

  // form.submit();
}