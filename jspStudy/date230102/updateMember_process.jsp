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

	<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String sql = "select id, pw from member where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()){
			String rId = rs.getString("id");
			String rPw = rs.getString("pw");
			if(id.equals(rId) && passwd.equals(rPw)){
				sql = "update member set name = ? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, id);
				int upd = pstmt.executeUpdate();
				if(upd != 0) out.println("Member 테이블을 수정했습니다.");
			}
			else {
				out.println("일치하는 비밀번호가 아닙니다.");
			}
		}
		else {
			out.println("Member 테이블에 일치하는 아이디가 없습니다.");
		}
	} catch(SQLException e){
		e.printStackTrace();
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