<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입한 회원 정보</title>
<link rel="stylesheet" href="./tableStyle.css">
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	// 파라미터 값
	String memberID = request.getParameter("memberID");
	String passwd = request.getParameter("passwd");
	String memberName = request.getParameter("memberName");
	String email = request.getParameter("email");
	String[] interestList = request.getParameterValues("interest");
	String interest = "";
	if(interestList != null){
		for(int i=0; i<interestList.length; i++){
			interest += (interestList[i] + " ");
		}
	}
	String zipCode = request.getParameter("zipCode");
	String address1 = request.getParameter("address1");
	String address2 = request.getParameter("address2");
	int birthYear = Integer.parseInt(request.getParameter("birthYear"));
	int birthMonth = Integer.parseInt(request.getParameter("birthMonth"));
	int birthDay = Integer.parseInt(request.getParameter("birthDay"));
	String mailYN = request.getParameter("mailYN");
	String smsYN = request.getParameter("smsYN");
	String ip = request.getParameter("ip");
	%>
	<table>
		<thead>
			<th>name</th>
			<th>value</th>
		</thead>
		<tbody>
			<tr>
				<th>memberID</th>
				<td><%= memberID %></td>
			</tr>
			<tr>
				<th>passwd</th>
				<td><%= passwd %></td>
			</tr>
			<tr>
				<th>memberName</th>
				<td><%= memberName %></td>
			</tr>
			<tr>
				<th>email</th>
				<td><%= email %></td>
			</tr>
			<tr>
				<th>interest</th>
				<td><%= interest %></td>
			</tr>
			<tr>
				<th>zipCode</th>
				<td><%= zipCode %></td>
			</tr>
			<tr>
				<th>address1</th>
				<td><%= address1 %></td>
			</tr>
			<tr>
				<th>address2</th>
				<td><%= address2 %></td>
			</tr>
			<tr>
				<th>birthYear</th>
				<td><%= birthYear %></td>
			</tr>
			<tr>
				<th>birthMonth</th>
				<td><%= birthMonth %></td>
			</tr>
			<tr>
				<th>birthDay</th>
				<td><%= birthDay %></td>
			</tr>
			<tr>
				<th>mailYN</th>
				<td><%= mailYN %></td>
			</tr>
			<tr>
				<th>smsYN</th>
				<td><%= smsYN %></td>
			</tr>
			<tr>
				<th>ip</th>
				<td><%= ip %></td>
			</tr>
		</tbody>
	</table>
	<div>
		INSERT INTO member
		(memberID, passwd, memberName, email, interest, zipCode,
		address1, address2, birthYear, birthMonth, birthDay, 
		mailYN, smsYN, ip)
		VALUES(<%= memberID %>, <%= passwd %>, <%= memberName %>, <%= email %>, <%= interest %>, <%= zipCode %>
		<%= address1 %>, <%= address2 %>, <%= birthYear %>, <%= birthMonth %>, <%= birthDay %>
		<%= mailYN %>, <%= smsYN %>, <%= ip %>);
	</div>
</body>
</html>