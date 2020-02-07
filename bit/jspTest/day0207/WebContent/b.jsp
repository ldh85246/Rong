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
	String data = "나는 나는 해적왕";
%>
<%= data %>
<hr>
<%-- <jsp:include page="a.jsp"/> --%>
<%@ include file="a.jsp" %>
</body>
</html>