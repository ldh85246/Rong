<%@page import="java.io.File"%>
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
	request.setCharacterEncoding("euc-kr");
	int no = Integer.parseInt(request.getParameter("no"));
	String pwd = request.getParameter("pwd");
	
	BoardDao dao = new BoardDao();
	
	String fname = dao.getBoard(no).getFname();
	// 파일명을 미리 변수에 담아둡니다.
	
	String path = request.getRealPath("upload");
	// 파일이 있는 실경로를 읽어옵니다.
	
	int re = dao.deleteBoard(no, pwd);
	
	if (re > 0) {
		if (fname != null) {
			File file = new File(path + "/" + fname);
			file.delete();
		}
		response.sendRedirect("listBoard.jsp");
	} else {
		%>
			게시물 삭제에 실패하였습니다.<br>
			비밀번호를 다시 확인해주세요.
		<%
	}
%>
</body>
</html>