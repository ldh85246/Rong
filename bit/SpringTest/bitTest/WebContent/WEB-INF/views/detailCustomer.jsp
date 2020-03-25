<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<회원 상세>
	<hr>
	회원아이디 : ${c.custid }<br>
	회원이름 : ${c.name }<br>
	회원주소 : ${c.address }<br>
	회원전화 : ${c.phone }<br>
	
	<a href="updateCustomer.do?custid=${c.custid }">수정</a>	
	<a href="deleteCustomer.do?custid=${c.custid }">삭제</a>
</body>
</html>