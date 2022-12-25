<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
	<%
	// 기본 설정
	request.setCharacterEncoding("utf-8");
	
	// 파일 저장할 경로 (실행하는 톰켓의 프로젝트 하위 디렉토리로!!.. 로컬에서 로직 확인 할 때 사용!)
	String realPath = request.getServletContext().getRealPath("resources/images");
	out.print(realPath);
	File dir = new File(realPath); // 파일 객체에 해당 경로(디렉토리 파일) 저장
	if(!dir.exists()) dir.mkdirs(); // 해당 경로 존재하지 않을 경우 디렉토리 생성하기
	
	// 파일 업로드 실행
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	
	String fileName = null;
	while(params.hasNext()){
		FileItem fileItem = (FileItem) params.next();
		if(!fileItem.isFormField()){ // input type="file"인 경우
			fileName = fileItem.getName();
			File file = new File(realPath + "/" + fileName); // 파일 경로 + 파일명
			fileItem.write(file); // 파일 관련 자원 저장
		}
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="${pageContext.request.contextPath}/resources/images/<%= fileName %>">
</body>
</html>