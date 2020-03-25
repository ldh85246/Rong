<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세정보</h2>
	고객번호 : ${c.custid }<br>
	고객이름 : ${c.name }<br>
	주소 : ${c.address }<br>
	전화 : ${c.phone }
	<hr>
	<a href="updateCustomer.do?custid=${c.custid }">수정</a>
	<a href="deleteCustomer.do?custid=${c.custid }">삭제</a>
</body>
</html>