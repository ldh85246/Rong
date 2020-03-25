<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#canvas {
	border: solid 1px black;
}
</style>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var canvas = document.getElementById("canvas"); // jQuery로는 canvas구현이 불가하기 때문에
		var context = canvas.getContext("2d"); 			// JavaScript를 사용한다.

		$("#btn").click(function() {
			context.beginPath();
			context.moveTo(10, 10);
			context.lineTo(110, 10);
			context.stroke();
		});
	});
</script>
</head>
<body>
	<canvas id="canvas" width="1000" height="600"></canvas>
	<button id="btn">가로선 그리기</button>
</body>
</html>