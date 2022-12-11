<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/footer.css">
    <link rel="stylesheet" href="./css/common.css">
    <link rel="stylesheet" href="./css/register.css">
    <script src="./js/header.js" defer></script>
    <script src="./js/register.js" defer></script>
</head>
<script src="https://spi.maps.daum.net/imap/map_js_init/postcode.v2.js"></script>
<body>
    <div id="listWrap_sh">
        <h1 id="title_sh">회원가입</h1>
    <form name="member_insert" id="list_sh" method="post">
        <ul id="forms_sh">
        <li> <span> 아이디</span> <input type="text" name="memberId" placeholder=" 아이디"></li>
        <span id="dblCheck1"> 인증하기</span>
        <li> <span> 비밀번호</span> <input type="password" name="password" placeholder=" 비밀번호"></li>
        <li> <span> 비밀번호 확인</span> <input type="password" name="password_cf"  placeholder=" 비밀번호 확인"></li>
        <li> <span> 이름</span> <input type="text" name="name"  placeholder=" 이름"></li>
        <li> <span> 별명</span> <input type="text" name="nickName"  placeholder=" 별명"></li>
        <span><span id="dblCheck2">별명 중복확인</span></span><br>
        <li id="sex">
        	<p id="man"><input type="radio" value="man" name="sex" checked><span>남성</span></p>
        	<p id="woman"><input type="radio" value="woman" name="sex"><span>여성</span></p>
        </li>
        <li> <span> 생년월일</span> <input type="number" name="birthYear"  placeholder=" 태어난 년"> 
            <input type="number" name="birthMonth"  placeholder=" 태어난 월"> 
            <input type="number" name="birthDay"  placeholder=" 태어난 일">
        </li>
        <li> <span> 휴대전화</span> 
        	<input type="number" name="phone" class="phone" maxlength="11" placeholder="휴대폰 번호를 입력해주세요.(숫자로만 입력)">
        </li>
        <li> <span> 집전화</span> 
        	<input type="number" name="homePhone" class="phone" maxlength="11" placeholder="전화번호를 입력해주세요.(숫자로만 입력)">
        </li>
        <li><span>우편번호</span> <input id="zipcode" type="text" name="zipCode" readonly  placeholder=" 우편번호"></li>
        <span id="dblCheck3" onclick="execDaumPostcode()" style="cursor:pointer;" > 우편번호 검색</span> <br>
            <li><span>집 주소1</span> <input id="address01" type="text" name="address1"  placeholder=" 주소" readonly></li>
            <li><span>집 주소2</span> <input id="address02" type="text" name="address2" placeholder=" 상세주소"></li>
        <input id="dblCheck4" type="button" name="submitBtn" value="회원가입">
    </ul>
    </form>
</div>
    <div class="footerWrap page onePage6">
        <footer class="page8" id="footer">
            <p class="us">about us</p>
            <div id="membersWrap">
                <p class="member0_sh member_sh"><a href="#" target="_blank">개인정보처리방침</a></p>
                <p class="member1_sh member_sh"><a href="hyehyun.html" target="_blank">김혜현</a></p>
                <p class="member2_sh member_sh"><a href="beomsu.html" target="_blank">오범수</a></p>
                <p class="member3_sh member_sh"><a href="haejun.html" target="_blank">오해준</a></p>
                <p class="member4_sh member_sh"><a
                        href="https://suhyun980716.github.io/LandingPage/Landing%20Page/index.html"
                        target="_blank">유수현</a></p>
                <p class="member5_sh member_sh"><a href="https://github.com/hyeahyun2/TeamProject"
                        target="_blank">GitHub</a></p>
            </div>
        </footer>
        <!-- 유수현 영역2 끝 -->
    </div>
</body>
</html>