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
	dao.updateHit(no);
	BoardVo b = dao.getBoard(no);
%>
글번호 : <%= b.getNo() %><br>
글제목 : <%= b.getTitle() %><br>
작성자 : <%= b.getWriter() %><br>
조회수 : <%= b.getHit() %><br>
글내용 : <br>
<textarea rows="10" cols="80" readonly="readonly"><%= b.getContent() %></textarea>
등록일 : <%= b.getRegdate() %><br>
IP주소 : <%= b.getIp() %><br>
파일 : <%= b.getFname() %><br>
<%
	if (dao.isImage(b.getFname())) {
		%>
			<img src="upload/<%= b.getFname() %>" width="200" height="200">
		<%
	}
%>
<hr>
<a href="insertBoard.jsp">새로운 글 작성</a>
<a href="listBoard.jsp">글목록</a>
<a href="updateBoard.jsp?no=<%=b.getNo()%>">글수정</a>
<a href="deleteBoard.jsp?no=<%=b.getNo()%>">글삭제</a>
</body>
</html>