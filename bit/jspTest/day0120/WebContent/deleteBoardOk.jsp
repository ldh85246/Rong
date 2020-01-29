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
	String pwd = request.getParameter("pwd");
	BoardDao dao = new BoardDao();
	int re = dao.deleteBoard(no, pwd);
	if (re > 0) {
		response.sendRedirect("boardTest.jsp");
	}
%>

<font color = "red">삭제에 실패하였습니다.</font><br>
<a href="boardTest.jsp">게시물 목록</a>

</body>
</html>