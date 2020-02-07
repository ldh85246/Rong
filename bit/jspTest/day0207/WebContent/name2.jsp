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
	String name = "홍길동";
%>
이름 : <%= name %><br>
<jsp:include page = "age2.jsp">
	<jsp:param value="25" name="age"/>
	<jsp:param value="seoul" name="addr"/>
</jsp:include>
</body>
</html>