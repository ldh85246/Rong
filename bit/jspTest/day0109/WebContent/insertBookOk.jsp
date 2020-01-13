<%@ page import= "com.bit.dao.BookDao" %>
<%@ page import= "com.bit.vo.BookVo" %>
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
		request.setCharacterEncoding("euc-kr");
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String bookname = request.getParameter("bookname");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookVo vo = new BookVo(bookid, bookname, publisher, price);
		BookDao dao = new BookDao();
		int re = dao.insertBook(vo);
		if(re > 0){
			%>
				<font color='blue'>도서등록에 성공하였습니다.</font>
			<%
		} else {
			%>
			<font color='red'>도서등록에 실패하였습니다.</font>
		<%
		}
	%>
</body>
</html>