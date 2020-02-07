<%@page import="java.io.File"%>
<%@page import="com.bit.vo.BoardVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		BoardDao dao = new BoardDao();
		request.setCharacterEncoding("euc-kr");

		String path = request.getRealPath("upload");
		System.out.println(path);

		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		int no = Integer.parseInt(multi.getParameter("no"));

		// 원래 게시물에 파일이 있는 경우 파일을 지울지 말지의 정보
		// isDel을 받아옵니다.
		String isDel = multi.getParameter("isDel");
		System.out.println(isDel);
		
		//수정을 하기 전에 미리 원래 파일명을 저장해 둡니다.
		String oldFname = dao.getBoard(no).getFname();
		String fname = multi.getOriginalFileName("fname");

		BoardVo b = new BoardVo();
		b.setNo(no);
		b.setTitle(multi.getParameter("title"));
		b.setPwd(multi.getParameter("pwd"));
		b.setContent(multi.getParameter("content"));

		// 일단 원래의 파일이름을 vo에 담고 
		// 만약 파일도 수정한다면 새로운 파일명을 vo에 담아요
		b.setFname(oldFname);
		if (fname != null) {
			b.setFname(fname);
		}
		
		if (isDel != null && isDel.equals("1")) {
			b.setFname(null);
		}
		
		int re = dao.updateBoard(b);

		// 게시물 수정에 성공했고 그 게시물이 원래 파일이 있는 게시물이었고
		// 또, 파일도 수정했다면 원래 파일은 삭제해요
		if (re > 0) {
			if (oldFname != null && fname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
			
			// 원래는 파일이 있었고, 게시물 수정에 성공했을 때
			// 파일을 지우기를 원한다면
			if (isDel != null && isDel.equals("1")) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
	%>
	게시물 수정에 성공하였습니다.
	<%
		} else {
			if (fname != null) {
				File file = new File(path + "/" + fname);
				file.delete();
			}
	%>
	게시물 수정에 실패하였습니다.
	<%
		}
	%>
	<hr>
	<a href="insertBoard.jsp">새글등록</a>
	<a href="listBoard.jsp">글목록</a>
</body>
</html>