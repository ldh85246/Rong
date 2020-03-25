<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div {
		display: inline-block;
		background: orange;
		width: 150px;
		height: 150px;
		border: 2px solid pink;
	}
</style>
</head>
<body>
	<h2>${title }</h2>
<c:forEach var="g" items="${list }">
	<div>
		<img src="img/${g.fname }" width="150" height="150"><br>
		<b>${g.item }(${g.price })</b>
	</div>
</c:forEach>
</body>
</html>