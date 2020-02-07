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
	%>
<h2>게시물 삭제</h2>
<form action="deleteBoardOk.jsp" method="post">
	<input type="hidden" name="no" value="<%=no%>">
	암호 : <input type="password" name="pwd">
	<input type="submit" value="삭제">
</form>
</body>
</html>