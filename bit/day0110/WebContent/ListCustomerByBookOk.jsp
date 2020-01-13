<%@page import="com.bit.dao.CustomerDao"%>
<%@page import="com.bit.vo.CustomerVo"%>
<%@page import="java.util.ArrayList"%>
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
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		CustomerDao dao = new CustomerDao();
		ArrayList<CustomerVo> list = dao.listCustomerByBookid(bookid);
	%>
	<h2>
		<%=bookid%>번 도서를 구매한 고객 목록
	</h2>
	<hr>
	<table border="1" width="80%">
		<tr>
			<td>고객번호</td>
			<td>이름</td>
			<td>주소</td>
			<td>전화</td>
		</tr>
		<%
			for (CustomerVo c : list) {
		%>
		<tr>
			<td><%=c.getCustid()%></td>
			<td><%=c.getName()%></td>
			<td><%=c.getAddress()%></td>
			<td><%=c.getPhone()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>