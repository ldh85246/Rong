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
	BoardVo b = dao.getBoard(no);
%>

<h2>게시물 수정</h2>
	<form action="updateBoardOk.jsp" method="post" enctype="multipart/form-data">
		<input type="hidden" name = "no" value="<%=no%>">
		<table width="80%">
			<tr>
				<td>글제목</td>
				<td><input type="text" name="title" value="<%=b.getTitle()%>"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><%=b.getWriter()%></td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td>
					<textarea rows="10" cols="80" name="content"><%=b.getContent()%></textarea>
				</td>
			</tr>
			<tr>
				<td>파일</td>
				<td>
					<%=b.getFname()%>
					<%
						if (b.getFname() != null) {
							%>
								<input type="checkbox" name="isDel" value="1">파일삭제
							<%
						}
					%>
					<%
						if (dao.isImage(b.getFname())) {
							%>
								<img src="upload/<%=b.getFname()%>" width="50" height="50">
							<%
						}
					%><br>
					<input type="file" name="fname">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>