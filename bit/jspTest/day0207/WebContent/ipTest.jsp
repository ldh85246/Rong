<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String ip = request.getRemoteAddr();
		System.out.println("요청한 고객의 ip주소 : " + ip);
	%>
	반갑습니다.
	<%=ip%>에서 접속하였습니다.
</body>
</html>