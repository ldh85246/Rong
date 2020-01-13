<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dao.BookDao"%>
<%@page import="com.bit.vo.BookVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>도서목록</h2>
	<hr>

	<table border="1" width="80%">
		<!-- 표를 만든다 -->
		<tr>
			<td>도서번호</td>
			<td>도서명</td>
			<td>출판사</td>
			<td>가격</td>
		</tr>

		<%
			BookDao dao = new BookDao();
			ArrayList<BookVo> list = dao.listBook();
			for (BookVo b : list) {
		%>
		<tr>
			<td><%=b.getBookid()%></td>
			<td><%=b.getBookname()%></td>
			<td><%=b.getPublisher()%></td>
			<td><%=b.getPrice()%></td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>