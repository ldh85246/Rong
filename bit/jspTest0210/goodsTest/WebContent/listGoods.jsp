<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div{
	width: 200px;
	height: 200px;
	display: inline-block;
	border: 1px solid pink;
	border-radius: 15px;  
}
</style>
</head>
<body>
	<h2>상품목록</h2>
	<c:forEach var="g" items="${list}">
		<div>
			<img src="img/${g.fname}}" width="150" height="150"><br>
			<b>${g.tiem}</b>(${g.price})
		</div>
	</c:forEach>
	<br>
	<br>
	<c:forEach var="i" begin="1" end="${totalPage}">
		<a href="listGoods.do?pageNUM=${i}">${i}</a>&nbsp;&nbsp;
	</c:forEach>
</body>
</html>