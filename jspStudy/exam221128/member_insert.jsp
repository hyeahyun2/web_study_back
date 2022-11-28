<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script src="https://spi.maps.daum.net/imap/map_js_init/postcode.v2.js"></script>
<script src="./member.js" defer></script>
</head>
<body>
	<%
	String ipPost = request.getRemoteAddr();
	%>
	<!-- action : member_insert_action.jsp -->
  <form name="member_insert" method="post">
    <input type="hidden" name="ip" value="<%= ipPost %>"> <!-- 가입한 브라우저의 ip -->
    <p> 회원 아이디 : <input type="text" name="memberID"></p>
    <p> 비밀번호 : <input type="password" name="passwd"></p>
    <p> 비밀번호 확인 : <input type="password" name="passwdCheck"></p>
    <p> 이름 : <input type="text" name="memberName"></p>
    <p> 이메일 : <input type="text" name="email"></p>
    <p> 관심사항 : 
      <input type="checkbox" name="interest" value="영화">영화
      <input type="checkbox" name="interest" value="독서">독서
      <input type="checkbox" name="interest" value="수영">수영
      <input type="checkbox" name="interest" value="등산">등산
    </p>
    <p> 우편번호 : <input type="text" name="zipCode" id="zipCode" readonly>
    <input type="button" name="postSearch" value="우편번호 검색"></p> <!-- 클릭시 : execDaumPostcode() 함수 호출 -->
    <p> 집 주소 1 : <input type="text" name="address1" id="address1" readonly></p>
    <p> 집 주소 2 : <input type="text" name="address2" id="address2"></p>
    <p> 태어난 해 : <input type="text" name="birthYear"></p>
    <p> 태어난 월 : <input type="text" name="birthMonth"></p>
    <p> 태어난 일 : <input type="text" name="birthDay"></p>
    <p> 메일 수신 여부 :
      <input type="radio" name="mailYN" value="yes">yes
      <input type="radio" name="mailYN" value="no">no
    </p>
    <p> 문자 수신 여부 :
      <input type="radio" name="smsYN" value="yes">yes
      <input type="radio" name="smsYN" value="no">no
    </p>
    <input type="button" name="submitBtn" value="가입하기">
  </form>
</body>
</html>