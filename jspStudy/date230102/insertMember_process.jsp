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
	<%@ include file="connDB.jsp" %>

	<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	PreparedStatement pstmt = null;
	
	try {
		String sql = "insert into member(id, pw, name) values (?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		int state = pstmt.executeUpdate();
		if(state != 0) out.println("Member 테이블 삽입이 성공했습니다.");
	} catch(SQLException e){
		out.println("Member  테이블 삽입이 실패했습니다. <br>");
		out.println("SQLException : " + e.getMessage());
	} finally {
		try{
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		} catch(Exception e){
			e.printStackTrace();		
		}
	}
	%>
</body>
</html>