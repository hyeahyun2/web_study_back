<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	Commons-FileUpload를 이용하여 파일 업로드 및 정보 출력하기
	Commons-FileUpload 패키지를 사용하도록 page 디렉티브 태그의 import 속성 값에
		패키지 org.apache.commons.fileupload.* 작성
	 --%>
	<%
	// 폼 페이지에서 전송된 파일을 저장할 서버 경로 작성
	String fileUploadPath = "C:\\hyeahyun\\uploadFile";
	// 파일 업로드를 위해 DiskFileUpload 클래스 작성
	DiskFileUpload upload = new DiskFileUpload();
	// 업로드할 파일의 최대 크기, 메모리상에서 저장ㅎ라 최대 크기, 업로드된 파일을 임시로 저장할 경로 작성
	upload.setSizeMax(1000000);
	upload.setSizeThreshold(4096);
	upload.setRepositoryPath(fileUploadPath);
	
	// 폼 페이지에서 전송된 요청 파라미터를 전달받도록 DiskFileUpload 객체 타입의 parseRequest() 작성
	List items = upload.parseRequest(request);
	// 폼 페이지에서 전송된 요청 파라미터를 Iterator 클래스로 변환
	Iterator params = items.iterator();
	
	// 폼 페이지에서 전송된 요청 파라미터가 없을 때까지 반복하도록 hsNext() 메서드 작성
	while(params.hasNext()){
		// 폼 페이지에서 전송된 요청 파라미터의 이름을 가져오도록 Iterator 객체 타입의 next() 메서드 작성
		FileItem item = (FileItem) params.next();
		
		if(item.isFormField()){
			// 폼 페이지에서 전송된 요청 파라미터가 일반 데이터면 요청 파라미터의 이름과 값 출력
			String name = item.getFieldName();
			String value = item.getString("utf-8");
			out.println(name + " = " + value + "<br>");
		}
		else {
			// 폼 페이지에서 전송된 요청 파라미터가 파일이면
			// 요청 파라미터의 이름, 저장된 파일의 이름, 파일 컨텐트 유형, 파일 크기에 대한 정보 출력
			String fileFieldName = item.getFieldName();
			String fileName = item.getName();
			String contetnType = item.getContentType();
			
			fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
			long fileSize = item.getSize();
			
			out.println("--------------------------<br>");
			out.println("요청 파라미터 이름 : " + fileFieldName + "<br>");
			out.println("저장 파일 이름 : " + fileName + "<br>");
			out.println("파일 콘텐츠 타입 : " + contetnType + "<br>");
			out.println("파일 크기 : " + fileSize + "<br>");
		}
	}
	%>
</body>
</html>