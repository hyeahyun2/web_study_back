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
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String sql = "select id, pw from member where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		if(rs.next()){ // 해당 아이디가 db에 존재하면
			String rId = rs.getString("id");
			String rPw = rs.getString("pw");
			if(id.equals(rId) && passwd.equals(rPw)){ // 비번 일치하면
				sql = "delete from member where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				int upd = pstmt.executeUpdate();
				if(upd != 0) { // 정상적으로 쿼리문 실행
					out.println("Member테이블에서 " + id + "사용자를 삭제했습니다.");
				}
			}
			else { // 비번 불일치
				out.println("일치하는 비밀번호가 아닙니다.");
			}
		}
		else { // 해당 아이디가 db에 존재하지 않으면
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