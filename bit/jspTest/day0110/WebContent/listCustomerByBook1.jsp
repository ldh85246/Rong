<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>도서를 구매한 고객 목록</h2>
	<form action="ListCustomerByBookOk.jsp" method="post">
		도서번호 : 
		<select name="bookid">
			<option value="11">재미있는 자바</option>
			<option value="1">축구의 역사</option>
			<option value="2">축구아는 여자</option>
			<option value="3">축구의 이해</option>
			<option value="4">골프 바이블</option>
		</select>
		<input type="submit" value="검색">
			
	</form>
</body>
</html>