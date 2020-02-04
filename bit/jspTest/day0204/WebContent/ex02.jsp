<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	String name = "홍길동";
	public int addAge(int age) {
		return age +1;
	}
%>

<h2>서블릿의 구성요소</h2>
1. 스크립트릿<br>
2. 표현식<br>
3. 선언문<br>

<%
	int age = 20;
	String addr = "서울시 마포구 신수동";
%>

이름 : <%= name %><br>
나이 : <%= age %><br>
주소 : <%= addr %><br>

<%
	int age2 = addAge(age);
%>
증가된 나이 : <%= age2 %><br>
증가한 나이 : <%= addAge(age) %><br>
</body>
</html>