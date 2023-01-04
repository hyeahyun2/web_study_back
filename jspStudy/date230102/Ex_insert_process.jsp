<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="connDB.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	CREATE TABLE student(
	num VARCHAR(10) PRIMARY KEY,
	depart VARCHAR(10),
	NAME VARCHAR(20),
	address VARCHAR(50),
	phone VARCHAR(13)
	);
	 --%>
	<%
	request.setCharacterEncoding("utf-8");
	
	String num = request.getParameter("num");
	String depart = request.getParameter("depart");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		// 중복 학번 찾기
		String sql = "select num from student where num = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, num);
		rs = pstmt.executeQuery();
		if(rs.next()){ // 이미 등록된 학번일 경우 (중복 학번일 경우)
			out.println("이미 등록된 학번입니다. 다시 입력해주세요.<br>");
			out.println("<a href='./Ex_insert.jsp'>이전 페이지로 돌아가기</a>");
		}
		else { // 중복 학번이 없을 경우
			sql = "insert into student(num, depart, name, address, phone)"
					+ " values(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.setString(2, depart);
			pstmt.setString(3, name);
			pstmt.setString(4, address);
			pstmt.setString(5, phone);
			int upd = pstmt.executeUpdate();
			if(upd != 0) {
				out.println("학생 정보 저장이 완료되었습니다. <br>");
				out.println("<a href='./Ex_insert.jsp'>이전 페이지로 돌아가기</a>");
			}
		}
	} catch(SQLException e) {
		out.println("정보 처리 오류가 발생했습니다. <br>");
		out.println("SQLException : " + e.getMessage());
	} finally {
		try{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	%>
</body>
</html>