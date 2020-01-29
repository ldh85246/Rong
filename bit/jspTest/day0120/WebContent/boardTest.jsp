<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dao.BoardDao"%>
<%@page import="com.bit.vo.BoardVo"%>
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
	BoardDao dao = new BoardDao();
	if (request.getMethod().equals("POST")) {
		request.setCharacterEncoding("euc-kr");
		// int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String pwd = request.getParameter("pwd");
		String content = request.getParameter("content");
		
		BoardVo b = new BoardVo(0, title, writer, pwd, content, null, 0);
		int re = dao.insertBoard(b);
	}
	
	// dao를 통해 모든 게시물 목록을 가져와 list에 담는다.
	ArrayList<BoardVo> list = dao.listAll();
%>
<form action="boardTest.jsp" method="post">
	제목 : <input type="text" name="title"><br>
	작성자 : <input type="text" name="writer"><br>
	암호 : <input type="password" name="pwd"><br>
	내용 : <br>
	<textarea rows="10" cols="80" name="content"></textarea><br>
	<input type="submit" value="등록">
</form>

<table border="1" width="80%">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>등록일</td>
		<td>조회수</td>
	</tr>
	<%
	// list의 데이터 수만큼 반복실행하여 tr을 생성하도록 해라.
	for (BoardVo b : list) {
		%>
			<tr>
				<td><%= b.getNo() %></td>
				<td>
					<a href="detailBoard.jsp?no=<%= b.getNo() %>"><%= b.getTitle() %></a>
				</td>
				<td><%= b.getWriter() %></td>
				<td><%= b.getRegdate() %></td>
				<td><%= b.getHit() %></td>
			</tr>
		<%
	}
	%>
</table>
</body>
</html>