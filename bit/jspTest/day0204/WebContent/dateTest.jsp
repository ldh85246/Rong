<%@page import="java.util.Date"%>
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
	Date today = new Date();
	int year = today.getYear();
	int month = today.getMonth();
	int date = today.getDate();
	int yoil = today.getDay();
%>
연도 : <%= year %><br>
월 : <%= month %><br>
일 : <%= date %><br>
요일 : <%= yoil %><br>
</body>
</html>