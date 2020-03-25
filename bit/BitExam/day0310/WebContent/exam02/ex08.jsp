<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#man {
		position: absolute;
		left: 10px;
		top: 400px;
	}
</style>
<script type="text/javascript">
window.onload = function() {
	var left = 10;
	var man = document.getElementById("man");
	
	setInterval(function() {
		left = left + 10;
		man.style.left = left + "px";
	}, 100);
}
</script>
</head>
<body>
	<div id="man"><img src="spongebob.png"></div>
</body>
</html>