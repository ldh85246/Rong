<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
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
		int year = 0;
		int month = 0;

		GregorianCalendar today = new GregorianCalendar();
		year = today.get(Calendar.YEAR);
		month = today.get(Calendar.MONTH);

		int thisYear = today.get(Calendar.YEAR);
		int thisMonth = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);

		if (request.getParameter("year") != null) {
			year = Integer.parseInt(request.getParameter("year"));
			month = Integer.parseInt(request.getParameter("month"));
		}

		if (month >= 12) {
			year++;
			month = 0;
		}

		if (month < 0) {
			year--;
			month = 11;
		}

		String tdColor = "white";
		String textColor = "black";

		GregorianCalendar startDay = new GregorianCalendar(year, month, 1);
		int yoil = startDay.get(Calendar.DAY_OF_WEEK);
		yoil--;

		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int last = lastDay[month];

		if (today.isLeapYear(year) && month == 1) {
			last++;
		}
	%>
	<h2 align = "center">
		<a href="calendarTest.jsp?year=<%=thisYear%>&month=<%=thisMonth%>"><font size="2">오늘로 이동</font></a><br>
		<a href="calendarTest.jsp?year=<%=year%>&month=<%=month - 1%>">이전달</a>
		<%=year%>
		년
		<%=month + 1%>
		월 <a href="calendarTest.jsp?year=<%=year%>&month=<%=month + 1%>">다음달</a>
	</h2>
	<br> 요일 :
	<%=yoil%>
	<table align="center" border="1" width="60%" height="400">
		<tr align="center">
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
		<%
			for (int j = 1; j <= yoil; j++) {
		%>
		<td>&nbsp;</td>
		<%
			}
			for (int i = 1; i <= last; i++) {
				tdColor = "white";
				textColor = "black";
				if (i == date && year == thisYear && month == thisMonth) {
					tdColor = "yellow";
				}

				if ((i + yoil) % 7 == 0) {
					textColor = "blue";
				}

				if ((i + yoil) % 7 == 1) {
					textColor = "red";
				}
		%>
		<td align="center" style="color : <%=textColor%>"
			bgcolor="<%=tdColor%>"><%=i%></td>
		<%
			if ((i + yoil) % 7 == 0 && i != last) {
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