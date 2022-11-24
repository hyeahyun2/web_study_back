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
	<table>
		<tr>
			<th>요청 파라미터 값</th>
		</tr>
		<% 
		request.setCharacterEncoding("utf-8");
		
		Enumeration paramNames = request.getParameterNames();
		
		while(paramNames.hasMoreElements()){
			String name = (String)paramNames.nextElement();
			out.print("<tr><td>" + name + "</td>\n");
			// checkbox => 배열 처리
			// 만약, checkbox인 input태그가 많을 경우 
				// => 모든 parameter을 배열로 받아서 처리해도 ok!!
			if(name.equals("hobby")){
				String[] hobbyValue = request.getParameterValues(name);
				out.print("<td>");
				if(hobbyValue != null){
				for(int i=0; i<hobbyValue.length; i++){
					out.println(" " + hobbyValue[i]);
				}
				}
				out.println("</td></tr>\n");
			}
			else {
				String paramValue = request.getParameter(name);
				out.println("<td>" + paramValue + "</td></tr>\n");
			}
		}
		%>
	</table>
</body>
</html>