<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("tr:first").css("background", "black").css("color", "white");
		$("td:nth-child(4n + 1)").css("background", "yellow");
		$("td:nth-child(4n + 2)").css("background", "pink");
	});
</script>
</head>
<body>
	<table width="80%">
		<tr><th>이름</th><th>국어</th><th>영어</th><th>수학</th></tr>
		<tr class="member"><td>홍길동</td><td>100</td><td>90</td><td>80</td></tr>
		<tr><td>이순신</td><td>90</td><td>80</td><td>100</td></tr>
		<tr class="member"><td>유관순</td><td>80</td><td>100</td><td>90</td></tr>
	</table>
</body>
</html>