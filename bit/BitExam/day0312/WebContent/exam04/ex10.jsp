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
		var arr = ["백반", "만두", "비빔밥", "토스트", "짜장면"];
		$.each(arr, function(idx, item) {
			$("#list").append($("<li></li>").html(item));
		});
	});
</script>
</head>
<body>
	<h2>직장인이 좋아하는 점심 메뉴 best 5</h2>
	<ul id="list"></ul>
</body>
</html>