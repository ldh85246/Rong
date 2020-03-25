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
		$("#btn").click(function() {
			var arr = $("input[type=text]");
			$.each(arr, function(idx, input) {
				alert($(this).val());
			});
		});
	});
</script>
</head>
<body>
	이름 : <input type="text"><br>
	주소 : <input type="text"><br>
	전화 : <input type="text"><br>
	<input id="btn" type="button" value="확인">
</body>
</html>