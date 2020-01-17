<%@page import="com.bit.dao.BookDao"%>
<%@page import="com.bit.vo.BookVo"%>
<%@page import="java.util.ArrayList"%>
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
	<%
		request.setCharacterEncoding("euc-kr");
		String keyword = request.getParameter("keyword");
		if (keyword != null) {
		}
		String sortField = request.getParameter("sortField");
		if (sortField != null) {
		}
		BookDao dao = new BookDao();
		ArrayList<BookVo> list = dao.listAll(sortField, keyword);
	%>

	<form action="listBook.jsp" method="post">
		출판사명 : <input type="text" name="keyword"> <input type="submit"
			value="검색">
	</form>

	<table border="1" width="80%">
		<tr>
			<td><a href="listBook.jsp?sortField=bookid">도서번호</a></td>
			<td><a href="listBook.jsp?sortField=bookname">도서명</a></td>
			<td><a href="listBook.jsp?sortField=publisher">출판사</a></td>
			<td><a href="listBook.jsp?sortField=price">가격</a></td>
		<tr>
			<%
				for (BookVo b : list) {
			%>
		
		<tr>
			<td><%=b.getBookid()%></td>
			<td><%=b.getBookname()%></td>
			<td><%=b.getPublisher()%></td>
			<td><%=b.getPrice()%></td>
		<tr>
			<%
				}
			%>
		
	</table>
</body>
</html>