<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상품상세</h2>
	<hr>
	상품번호 : ${g.no }<br>
	상품명 : ${g.name }<br>
	상품가격 : ${g.price }<br>
	상품수량 : ${g.qty }<br>
	<img src="img/${g.fname }"><br>
	상품상세 : <textarea rows="10" cols="80">${g.detail }</textarea><br>
</body>
</html>