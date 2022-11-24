<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	<%
	request.setCharacterEncoding("utf-8");
	
	Enumeration para = request.getParameterNames();
	while(para.hasMoreElements()){
		//StringBuffer info = new StringBuffer((String)para.nextElement());
		//String infoValue = request.getParameter(info.toString());
		String paraName = (String)para.nextElement();
		String paraValue = request.getParameter(paraName);
		out.println(paraName + " >> " + paraValue + "<br>");
	}
	
	%>
	</p>
</body>
</html>