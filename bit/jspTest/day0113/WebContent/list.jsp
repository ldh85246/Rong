<%@page import="com.bit.dao.DeptDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>회원별 구매내역</h2>
<%
	DeptDao dao = new DeptDao();
	ArrayList<Map<String, String>> list =dao.listOrdersByCustomer();
%>
<table border="1" width="80%">
	<tr>
		<td>고객명</td>
		<td>총구매건수</td>
		<td>총구매액</td>
		<td>평균구매액</td>
	</tr>
	<%
		for (Map<String, String> map : list) {
			%>
			<tr>
				<td><%= map.get("name") %></td>			
				<td><%= map.get("cnt") %></td>			
				<td><%= map.get("tot") %></td>			
				<td><%= map.get("avg") %></td>
			</tr>
			<%			
		}
	%>
</table>
</body>
</html>