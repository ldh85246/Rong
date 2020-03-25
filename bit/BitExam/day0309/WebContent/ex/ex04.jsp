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
		var arr =["java", "oracle"];
		$("#btnChange").click(function() {
			var h1 = $("h1");
			$.each(arr, function(idx, item) {
				$(h1[idx]).html(item);
			});
		});
	});
</script>
</head>
<body>
	<h1>자바</h1>
	<h1>오라클</h1>
	<button id="btnChange">영어로 바꾸기</button>
</body>
</html>