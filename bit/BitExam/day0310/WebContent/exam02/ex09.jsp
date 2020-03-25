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
	var arr = ["", "", "", ""];
	var left = 10;
	var man = document.getElementById("man");
	var i = 0;
	var step = 10;
	
	setInterval(function() {
		if (left >= window.innerWidth - 30 || left < 10) {
			step = step * -1;
		}
		
		left = left + step;
		man.style.left = left + "px";
		man.childNodes[0].src = arr[i];
		i++;
		if (i >= arr.length) {
			i = 0;
		}
	}, 100);
}
</script>
</head>
<body>
	<div id="man"><img src="spongebob.png"></div>
</body>
</html>