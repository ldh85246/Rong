<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
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
		GregorianCalendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int last = lastDay[month];
		if (cal.isLeapYear(year)) {
			last = 29;
		}

		GregorianCalendar startDay = new GregorianCalendar(year, month, 1);
		int start = startDay.get(Calendar.DAY_OF_WEEK);
		month++;
	%>
	<h2><%=year%>년
		<%=month%>월
	</h2>

	<table border="1" width="50%" height="400">
		<tr align="center" bgcolor="pink">
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
		<tr align="center">
			<%
				for (int i = 1; i < start; i++) {
			%>
			<td>&nbsp;</td>
			<%
				}
				for (int i = 1; i <= last; i++) {
					if (i == date) {
			%>
			<td bgcolor="yellow"><%=i%></td>
			<%
				} else {
						if ((i + start - 1) % 7 == 0) {
			%>
			<td><font color="blue"><%=i%></font></td>
			<%
				} else if ((i + start - 1) % 7 == 1) {
			%>
			<td><font color="red"><%=i%></font></td>
			<%
				} else {
			%>
			<td><%=i%></td>
			<%
				}
					}
					if ((i + start - 1) % 7 == 0 && i != last) {
			%>
		</tr>
		<tr align="center">
			<%
				}
				}
			%>
		</tr>
	</table>
</body>
</html>