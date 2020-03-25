<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#canvas {
	width: 3000px;
	height: 1000px;
}

#man {
	position: absolute;
	left: 10px;
	top: 10px;
	width: 50px;
	height: 50px;
}
</style>

<script type="text/javascript">
	window.onload = function() {
		var man = document.getElementById("man");
		document.getElementById("canvas").onmousedown = function() {
			var event = window.event;
			var x = event.x;
			var y = event.y;
			
			man.style.left = x + "px";
			man.style.top = y + "px";
		}
	}
</script>

</head>
<body>
	<div id="canvas">
		<img id="man" src="../man.gif">
	</div>
</body>
</html>