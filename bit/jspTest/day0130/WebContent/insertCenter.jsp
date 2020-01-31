<%@page import="com.bit.vo.CenterVo"%>
<%@page import="com.bit.dao.CenterDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>지점 등록</h2>
<hr>
	<form action="insertCenterOk.jsp" method="post">
		지점코드 : <input type="text" name="c_no"><br>
		지점명 : <input type="text" name="c_name"><br>
		전화번호 : <input type="text" name="c_tel"><br>
		주소 : <input type="text" name="c_addr"><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>