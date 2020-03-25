<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.hl0 {
		background: red;
	}
	.hl1 {
		background: orange;
	}
	.hl2 {
		background: yellow;
	}
	.hl3 {
		background: green;
	}
	.hl4 {
		background: blue;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("h1").each(function(idx, item) {
			$(this).addClass("hl" + idx);
		});
	});
</script>
</head>
<body>
	<h1>사과</h1>
	<h1>포도</h1>
	<h1>오렌지</h1>
	<h1>수박</h1>
	<h1>딸기</h1>
</body>
</html>