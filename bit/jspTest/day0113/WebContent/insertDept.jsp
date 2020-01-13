<%@page import="com.bit.dao.DeptDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>부서 등록</h2>
	<hr>
	<%
		DeptDao dao = new DeptDao();
		int dno = dao.getNextDno();
	%>
	<form action="insertDeptOk.jsp" method="post">
		부서번호 : <input type="text" readonly="readonly" name="dno" value = "<%= dno %>"><br>
		부서명 : <input type="text" name="dname"><br>
		부서위치 : <input type="text" name="dloc"><br>
		<input type="submit" value="등록">
		</form>
</body>
</html>