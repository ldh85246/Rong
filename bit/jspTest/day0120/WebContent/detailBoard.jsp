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
<h2>게시물 상세</h2>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao dao = new BoardDao();
	BoardVo b = dao.getBoard(no, true);
%>
	글번호 : <%= b.getNo() %><br>
	제목 : <%= b.getTitle() %><br>
	작성자 : <%= b.getWriter() %><br>
	내용 : <br>
	<textarea rows="10" cols="80" readonly="readonly"><%= b.getContent() %></textarea>
	<br>
	등록일 : <%= b.getRegdate() %><br>
	조회수 : <%= b.getHit() %><br>
	<a href="updateBoard.jsp?no=<%= no %>">수정</a>
	<a href="deleteBoard.jsp?no=<%= no %>">삭제</a>
</body>
</html>