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
	<h2>고객관리</h2>
	<%
		String method = request.getMethod();
		CustomerDao dao = new CustomerDao();
		if (method.equals("POST")) {
			request.setCharacterEncoding("euc-kr");
			int custid = Integer.parseInt(request.getParameter("custid"));
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			CustomerVo c = new CustomerVo(custid, name, address, phone);
			dao.insertCustomer(c);
		}
		ArrayList<CustomerVo> list = dao.listCustomer();
	%>

	<form action="customerTest.jsp" method="post">
		고객번호<input type="number" name="custid">
		고객명<input type="text" name="name">
		주소<input type="text" name="address">
		연락처<input type="text" name="phone">
		<input type="submit" value="등록">
	</form>

	<table border="1" width="80%">
		<tr>
			<td>고객번호</td>
			<td>고객명</td>
			<td>주소</td>
			<td>연락처</td>
		</tr>
		<%
			for (CustomerVo c : list) {
		%>
		<tr>
			<td><%= c.getCustid() %></td>
			<td><%= c.getName() %></td>
			<td><%= c.getAddress() %></td>
			<td><%= c.getPhone() %></td>
		</tr>
		<%	
			}
		%>
	</table>
</body>
</html>