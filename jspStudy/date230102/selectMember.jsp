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
	<%-- Statement 객체를 이용하여 select 쿼리문 실행 결과 값 가져오기 --%>
	<table width="300" border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	<%
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		String sql = "select * from member";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			%>
			<tr>
				<td><%= id %></td>
				<td><%= pw %></td>
				<td><%= name %></td>
			</tr>
			<%
		}
	} catch(Exception e){
		e.printStackTrace();
	} finally {
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	%>
	</table>
</body>
</html>