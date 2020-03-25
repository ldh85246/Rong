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
	<h2>게시판 목록</h2>
	<a href="insertBoard.do">글 쓰기</a>
	<hr>
	<table border="1" width="100%">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
			<td>ip</td>
		</tr>
		<c:forEach var="b" items="${list }">
			<tr>
				<td>${b.no }</td>
				<td><c:if test="${b.b_level > 0 }">
						<c:forEach var="i" begin="1" end="${b.b_level }">
						&nbsp;
					</c:forEach>
					┗
				</c:if> <a href="detailBoard.do?no=${b.no }">${b.title }</a></td>
				<td>${b.writer }</td>
				<td>${b.regdate }</td>
				<td>${b.hit }</td>
				<td>${b.ip }</td>
			</tr>
		</c:forEach>
	</table>
	<c:forEach var="i" begin="1" end="${totalPage }">
		<a href="listBoard.do?pageNUM=${i }">${i }</a>&nbsp;&nbsp;
	</c:forEach>
</body>
</html>