<%@page import="java.util.Date"%>
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
		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();

		Date startDay = new Date(year, month, 1);
		int yoil = startDay.getDay();

		int last = lastDay[month];
		month++;
		year += 1900;
	%>
	요일 : <%=yoil%><br>
	<h2><%=year + "년" + " " + month + "월"%></h2>
	<hr>
	<table border="1">
		<tr>
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
		<tr>
			<%
				// 				for (int n = 1; n <= 31; n++) {
				// 					if ((n - 1) % 7 == 0) {
				// 						out.print("<tr>");
				// 					}
				for (int j = 1; j <= yoil; j++) {
			%>
			<td></td>
			<%
				}
				for (int i = 1; i <= last; i++) {
			%>
			<td><%=i%></td>
			<%
				if ((i + yoil) % 7 == 0) {
			%>
		</tr>
		<tr>
			<%
				}
				}
			%>
		</tr>
	</table>
</body>
</html>