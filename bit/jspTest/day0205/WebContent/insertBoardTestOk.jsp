<%@page import="com.bit.dao.BoardDao"%>
<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		String path = request.getRealPath("upload");
		System.out.println(path);

		// 파일을 업로드하면서 사용자의 입력정보를 받아오기 위한 MultiopartRequest객체를 생성합니다.
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		
		/*
		업로드한 파일은 위에서 MultipartRequest객체 생성시에 이미 복사가 되었습니다.
		이제 나머지 정보(글제목, 작성자, 글내용, 암호)를 multi를 통해서 받아옵니다.
		*/
		BoardVo b = new BoardVo();
		b.setTitle(multi.getParameter("title"));
		b.setWriter(multi.getParameter("writer"));
		b.setPwd(multi.getParameter("pwd"));
		b.setContent(multi.getParameter("content"));
		
		// b.setFname(multi.getParameter("fname"));
		// 파일이름은 이렇게 하면 안되요!
		// 파일명이 오는 것이 아니라 파일의 내용이 오기 때문에 이렇게 담을 수 없어요
		b.setFname(multi.getOriginalFileName("fname"));
		// 파일명은 위와 같이 받아와야 해요!
		
		BoardDao dao = new BoardDao();
		int re = dao.insertBoard(b);
		if (re > 0) {
			%>
				게시물 등록에 성공하였습니다.
			<%
		} else {
			%>
				게시물 등록에 실패하였습니다.
			<%
		}
	%>
</body>
</html>