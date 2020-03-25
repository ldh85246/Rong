<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#div {
		width: 500px;
		height: 500px;
		background: skyblue;
	}
</style>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("div").onclick = function() {
			alert("레이어를 클릭했습니다!");
		}
		document.getElementById("btn").onclick = function() {
			alert("버튼을 클릭했습니다!");
		}
	}
</script>
</head>
<body>
	<div id="div">
		레이어<br>
		<button id="btn">Push Push Baby</button>
	</div>
</body>
</html>