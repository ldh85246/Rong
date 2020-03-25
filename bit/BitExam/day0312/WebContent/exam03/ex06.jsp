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
		$("tr:gt(0)").css("background","pink");	
		$("tr:eq(0)").css("background","#000000").css("color","#ffffff");
	});
</script>
</head>
<body>
	<table width="80%">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr class="member"><td>홍길동</td><td>80</td><td>80</td><td>70</td></tr>
		<tr class="member"><td>이순신</td><td>90</td><td>90</td><td>90</td></tr>
		<tr class="member"><td>유관순</td><td>70</td><td>80</td><td>100</td></tr>
		<tr class="member"><td>김유신</td><td>100</td><td>75</td><td>40</td></tr>
		<tr class="member"><td>강감찬</td><td>90</td><td>60</td><td>100</td></tr>
	</table>
</body>
</html>