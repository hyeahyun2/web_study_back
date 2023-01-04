<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	CREATE TABLE member(
		id VARCHAR(20),
		pw VARCHAR(100),
		NAME VARCHAR(20)
	);
	 --%>
	<%@ include file="connDB.jsp" %>
	<%--
	Statement 객체로 INSERT 쿼리문 실행하기.
	1) Statement 객체를 null로 초기화
	2) member 테이블의 각 필드에 폼 페이지에서 전송된 아이디, 비밀번호, 이름을 삽입하도록 insert문 작성
	3) Statement 객체를 생성하도록 작성
	4) insert 문을 실행하도록 Statement 객체의 executeUpdate() 메서드 작성
	5) insert 문의 실행이 성공하면 메세지를 출력
	6) 생성한 Statement 객체와 Connection 객체를 해제
	 --%>
	<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	Statement stmt = null;
	
	try {
		String sql = "insert into member(id, pw, name) values ('"
				+ id + "', '" + passwd + "', '" + name +"')";
		out.print(sql + "<br>");
		stmt = conn.createStatement();
		int state = stmt.executeUpdate(sql);
		if(state!=0) out.println("Member 테이블 삽입이 성공했습니다.");
	} catch(SQLException e){
		out.println("Member  테이블 삽입이 실패했습니다. <br>");
		out.println("SQLException : " + e.getMessage());
	} finally {
		try{
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
		} catch(Exception e){
			e.printStackTrace();		
		}
	}
	%>
</body>
</html>