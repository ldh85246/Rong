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
		$("#btn").click(function(){
			$("#msg").html("얄루");
		});
	});
</script>
</head>
<body>
	<button id="btn">클릭</button><br>
	<span id="msg"></span>
</body>
</html>