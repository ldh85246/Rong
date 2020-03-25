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
	<h2>도서목록</h2>
		<table>
			<tr>
				<td>도서번호</td>
				<td>도서명</td>
				<td>출판사</td>
				<td>가격</td>
			</tr>
			<tr>
				<c:forEach var="b" items="${list }">
					<li>${b.bookid }</li>
					<li>${b.bookname }</li>
					<li>${b.publisher }</li>
					<li>${b.price }</li>
				</c:forEach>
			</tr>
		</table>
</body>
</html>