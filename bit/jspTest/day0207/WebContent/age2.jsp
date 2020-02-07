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
	int age = 20;
	if (request.getParameter("age") != null) {
		age = Integer.parseInt(request.getParameter("age"));
	}
%>
나이는 <%= age %>살 입니다.
주소 : <%= request.getParameter("addr") %>
</body>
</html>