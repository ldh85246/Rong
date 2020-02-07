<%@page import="com.bit.dao.MemberDao"%>
<%@page import="com.bit.vo.MemberVo"%>
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
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	MemberDao dao = new MemberDao();
	if (dao.isMember(id, pwd)) {
		session.setAttribute("id", "id");
		response.sendRedirect("listBoard.jsp");
	} else {
		response.sendRedirect("login.jsp");
	}
%>
</body>
</html>