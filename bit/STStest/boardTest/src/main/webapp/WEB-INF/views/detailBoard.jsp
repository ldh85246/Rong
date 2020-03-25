<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${b.title }</h2>
	<hr>
	<table>
		<tr>
			<td>작성자</td>
			<td>${b.writer }</td>
		</tr>
		<tr>
			<td>글 내용</td>
			<td><textarea rows="10" cols="80" readonly="readonly">${b.content }</textarea></td>
		</tr>
		<tr>
			<td>파일</td>
			<td><img src="upload/${b.fname }" width=150 height=150"></td>
		</tr>
		<tr>
			<td colspan="2"><a href="updateBoard.do?no=${b.no }">글 수정</a> <a
				href="deleteBoard.do?no=${b.no }">글 삭제</a> <a
				href="insertBoard.do?no=${b.no }">답글 작성</a></td>
		</tr>
	</table>
</body>
</html>