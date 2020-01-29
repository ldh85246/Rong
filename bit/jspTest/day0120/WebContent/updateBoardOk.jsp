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
<h2></h2>
<%
	request.setCharacterEncoding("euc-kr");
	int no = Integer.parseInt(request.getParameter("no"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String pwd = request.getParameter("pwd");
	
	BoardVo b = new BoardVo();
	b.setNo(no);
	b.setTitle(title);
	b.setContent(content);
	b.setPwd(pwd);
	
	BoardDao dao = new BoardDao();
	int re = dao.updateBoard(b);
	if (re > 0) {
		out.print("<font color='blue'>수정하였습니다.</font>");
	} else {
		out.print("<font color='red'>수정에 실패하였습니다.</font>");
	}
%>
<br>
<a href="boardTest.jsp">게시물 목록</a>
</body>
</html>