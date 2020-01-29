<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.bit.dao.BoardDao"%>
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
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		BoardVo b = dao.getBoard(no, false);
	%>
	<h2>게시물 수정</h2>
	<form action="updateBoardOk.jsp" method="post">
		<input type="hidden" name = "no" value="<%= b.getNo() %>">
		제목 : <input type="text" name="title" value="<%= b.getTitle() %>"><br>
		작성자 : <input type="text" name="writer" readonly="readonly" value="<%= b.getWriter() %>"><br>
		암호 : <input type="password" name="pwd"><br>
		내용 : <br>
		<textarea rows="10" cols="80" name="content"><%= b.getContent() %></textarea><br>
		<input type="submit" value="수정">
</form>
</body>
</html>