<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("passwd");
	
	if(user_id.equals("admin") && user_pw.equals("1234")){
		session.setAttribute("userID", user_id);
		session.setAttribute("userPW", user_pw);
	}
	%>
	
	<p>* getAttribute() 사용</p>
	<%--
	세션에 저장된 속성 값 가져와 출력하기
	1) 세션에 저장된 세션 속성 이름 userID, userPW의 속성값을 가져오도록
	session 내장 객체의 getAttribute() 메서드를 작성
	 --%>
	<%
	String user_idInfo = (String)session.getAttribute("userID");
	String user_pwInfo = (String)session.getAttribute("userPW");
	
	out.println("설정된 세션의 속성값 [1] : " + user_idInfo + "<br>");
	out.println("설정된 세션의 속성값 [2] : " + user_pwInfo + "<br>");
	%>
	<hr>
	<p>* getAttributeNames() 사용</p>
	<%--
	세션에 저장된 모든 세션 속성 이름과 속성 값 가져와 출력하기.
	1) 세션에 저장된 모든 세션 속성 이름을 가져오도록 
		session 내장 객체의 getAttributeNames() 메서드 사용
	2) Enumeration 객체의 hasMoreElements() 메서드를 통해
		저장된 세션 속성 이름이 있을 때까지 반복하도록 while문을 작성
	3) 세션 속성 이름을 가져오도록 Enumeration 객체의 nextElemnet()메서드 작성
	4) 세션 속성 이름의 속성 값을 가져오도록 session 내장 객체의 getAttribute() 메서드를 작성
	--%>
	<%
	String name;
	String value;
	
	Enumeration<String> en = session.getAttributeNames();
	int i = 0;
	while(en.hasMoreElements()){
		i++;
		name = en.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("설정된 세션의 속성 이름 [" + i + "] : " + name + "<br>");
		out.println("설정된 세션의 속성 값 [" + i + "] : " + value + "<br>");
	}
	%>
</body>
</html>