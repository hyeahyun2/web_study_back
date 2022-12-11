<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	// 파라미터 값
	String memberID = request.getParameter("memberId");
	String passwd = request.getParameter("password");
	String name = request.getParameter("name");
	String nickName = request.getParameter("nickName");
	String sex = request.getParameter("sex");
	String birthYear = request.getParameter("birthYear");
	String birthMonth = request.getParameter("birthMonth");
	String birthDay = request.getParameter("birthDay");
	String birth = birthYear + birthMonth + birthDay; // 생년월일
	String phone = request.getParameter("phone");
	String homePhone = request.getParameter("homePhone");
	String zipCode = request.getParameter("zipCode");
	String address1 = request.getParameter("address1");
	String address2 = request.getParameter("address2");
	
	// DB 연결
	final String driver = "org.mariadb.jdbc.Driver";
	final String DB_URL = "jdbc:mariadb://127.0.0.1:3306/myStudy";
	final String DB_USER = "root";
	final String DB_PASS = "6995";
	String sql = "insert into user (memberId, password, name, nickName, sex, " +
			"birth, phone, homePhone, zipCode, address1, address2) " + 
			"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	Connection conn = null;
	PreparedStatement pstmt = null; 
	ResultSet resultSet = null;
	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		pstmt = conn.prepareStatement(sql);
		// 매개변수 넣기
		pstmt.setString(1, memberID);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.setString(4, nickName);
		pstmt.setString(5, sex);
		pstmt.setString(6, birth);
		pstmt.setString(7, phone);
		pstmt.setString(8, homePhone);
		pstmt.setString(9, zipCode);
		pstmt.setString(10, address1);
		pstmt.setString(11, address2);
		// 쿼리 실행 + 결과 담기
		resultSet = pstmt.executeQuery();
	} catch(Exception e){
		e.printStackTrace();
	}
	
	try {
		if(resultSet != null) resultSet.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	} catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("login.html");
	%>
</body>
</html>