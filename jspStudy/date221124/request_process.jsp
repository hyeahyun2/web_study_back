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
	String getQuery = request.getQueryString();
	int idx = getQuery.indexOf("&");
	String idValue = getQuery.substring(0, idx);
	String pwValue = getQuery.substring(idx+1);
	%>
	<%=request.getQueryString()%><br>
	--------------- 분리 -----------------<br>
	<p><%=idValue %>
	<p><%=pwValue %>
</body>
</html>