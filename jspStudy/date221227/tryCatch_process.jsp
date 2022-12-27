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
	try {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = a / b;
		out.print(num1 + " / " + num2 + " = " + c);
	} catch(NumberFormatException e) {
		// 예외가 발생한 경우 -> tryCatch_error.jsp 파일로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("tryCatch_error.jsp");
		// request로 받은 파라미터를 다음 페이지로 response
		dispatcher.forward(request, response);
	}
	%>
</body>
</html>