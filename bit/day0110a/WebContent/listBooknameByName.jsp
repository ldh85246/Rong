<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>고객이 구매한 도서목록</h2>
	<form action="ListBooknameByNameOk.jsp" method="post">
		고객명 : <input type="text" name="name">
		<input type="submit" value="검색">
	</form>
</body>
</html>