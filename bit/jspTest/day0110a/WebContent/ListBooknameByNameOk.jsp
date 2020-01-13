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
	<%
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
	%>

	<h2><%=name%>님이 구매한 도서목록
	</h2>
	<table border="1" width="80%">
		<tr>
			<td>도서명</td>
		</tr>
		<%
			BookDao dao = new BookDao();
			ArrayList<BookVo> list = dao.listBookByName(name);
			for (BookVo b : list) {
		%>
		<tr>
			<td><%=b.getBookname()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>