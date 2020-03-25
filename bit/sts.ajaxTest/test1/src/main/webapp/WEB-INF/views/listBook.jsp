<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.active {
	background: aqua;
}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#tr").hover(function() {
			$(this).addClass("active");
		}, function() {
			$(this).removeClass("active");
		});
	});
</script>
</head>
<body>
	<h2>도서목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>도서번호</td>
			<td>도서이름</td>
			<td>출판사명</td>
			<td>도서가격</td>			
		</tr>
		
		<c:forEach var="b" items="${list }">
			<tr id="tr">
				<td>${b.bookid }</td>
				<td><a href="detailBook.do?bookid=${b.bookid }">${b.bookname }</a></td>
				<td>${b.publisher }</td>
				<td>${b.price }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="insertBook.do">등록</a>
</body>
</html>