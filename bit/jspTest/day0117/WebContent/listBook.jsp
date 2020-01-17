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
		String searchField = request.getParameter("searchField");
		if (keyword != null) {
			// 검색어(keyword)와 검색컬럼(searchField)을 session을 이용하여 저장해둔다.
			session.setAttribute("keyword", keyword);			// 검색어
			session.setAttribute("searchField", searchField);	// 검색컬럼
		}
		String sortField = request.getParameter("sortField");
		if (sortField != null) {
		}
		
		BookDao dao = new BookDao();
		
		// Dao에게 일을 시키기 전에 혹시 session에 검색어(keyword)와 검색컬럼(searchField)이 있다면 읽어와서 그 정보를 dao에게 전달해준다.
		keyword = (String)session.getAttribute("keyword");
		searchField = (String)session.getAttribute("searchField");
		ArrayList<BookVo> list = dao.listAll(sortField, keyword, searchField);
	%>

	<form action="listBook.jsp" method="post">
		<select name="searchField">
			<option value="bookid">도서번호</option>
			<option value="bookname">도서명</option>
			<option value="publisher">출판사</option>
		</select> : <input type="text" name="keyword"> <input type="submit"
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