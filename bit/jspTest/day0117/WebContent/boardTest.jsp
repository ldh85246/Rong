<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>게시판</h2>
	<%
		
	%>
	<form name="F" action="borderTest.jsp" method="post">
		게시물 번호 : <input type="number" readonly="readonly" name="no" id="no"><br>
		제목 : <input type="text" name="title" id="title"><br>
		작성자 : <input type="text" name="writer" id="writer"><br>
		암호 : <input type="text" name="pwd" id="pwd"><br>
		내용 : <textarea name="content" id="content" rows="10" cols="80"></textarea>
	</form>
	<table border="1" width="80%">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>암호</td>
			<td>글내용</td>
			<td>등록일</td>
			<td>조회수</td>
		<tr>
	</table>
</body>
</html>