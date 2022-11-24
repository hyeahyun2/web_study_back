<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	//Enumeration en = request.get
	
	%>
	<jsp:useBean id="bean" class="model.DTO">
		<jsp:setProperty name="bean" property="*" />
	</jsp:useBean>
	<%=bean.getAddress() %>
	
	Array arr = new Array();
	dto 제모그, 이름, 내용, 날짜, ㅇㄹㄴㅇㄹㅇㄴ	
	
	arr.get(1).getNaem()
	arr.get(1).getContent()\
	arr.get(1).getDate()
	
	<%--
	insert into tabel values(?,?,?,?,?,?,  );
	? = 1,get.dfsd
	select * from board hwwr ddfs;
	rs
	
	DTO bean = new DTO();
	
	bean.setName(  )
	--%>
</body>
</html>