<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img {
		width: 100px;
		height: 100px;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		setInterval(function() {
			$("img").first().appendTo("#div");		// body지정 시 모두 동작하기 때문에 div로
		}, 1000);									// 레이어를 지정하여 동작시킴
	});
</script>
</head>
<body>
	<br>
	<div id="div">
		<img src="../stock1.jpg">
		<img src="../stock2.jpg">
		<img src="../stock3.jpg">
		<img src="../stock4.jpg">
		<img src="../stock5.jpg">
	</div>	
	
	<hr>
	<h2>회원정보</h2>
	<table border="1" width="80%">
		<tr>
			<td>이름</td>
			<td>나이</td>
			<td>주소</td>
		</tr>
	</table>
</body>
</html>