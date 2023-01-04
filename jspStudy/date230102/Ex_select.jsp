<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./connDB.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="500">
		<thead>
			<tr>
				<th>학번</th>
				<th>학과</th>
				<th>이름</th>
				<th>주소</th>
				<th>연락처</th>
			</tr>
		</thead>
		<tbody>
			<%
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				String sql = "select * from student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
			%>
					<tr>
						<td><%= rs.getString("num") %></td>
						<td><%= rs.getString("depart") %></td>
						<td><%= rs.getString("name") %></td>
						<td><%= rs.getString("address") %></td>
						<td><%= rs.getString("phone") %></td>
					</tr>
			<%
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}
			%>
		</tbody>
	</table>
</body>
</html>