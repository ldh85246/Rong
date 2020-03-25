<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var sun = document.getElementById("sun");
		var earth = document.getElementById("earth");
		var moon = document.getElementById("moon");
		sun.style.position = "absolute";
		earth.style.position = "absolute";
		moon.style.position = "absolute";

		sun.style.left = 250 + "px";
		sun.style.top = 200 + "px";

		var earthAngle = 0;
		var moonAngle = 0;

		setInterval(function() {
			var earthLeft = 250 + 150 * Math.cos(earthAngle); // 태양 위치(왼쪽)를 기준으로 지구 위치(왼쪽) 계산
			var earthTop = 200 + 150 * Math.sin(earthAngle); // 태양 위치(위쪽)를 기준으로 지구 위치(위쪽) 계산
			var moonLeft = earthLeft + 50 * Math.cos(moonAngle); // 지구 위치(왼쪽)를 기준으로 달 위치(왼쪽) 계산
			var moonTop = earthTop + 50 * Math.sin(moonAngle); // 달 위치(위쪽)를 기준으로 달 위치(위쪽) 계산

			earth.style.left = earthLeft + "px";
			earth.style.top = earthTop + "px";

			moon.style.left = moonLeft + "px";
			moon.style.top = moonTop + "px";

			earthAngle += 0.1;
			moonAngle += 0.3;

		}, 1000 / 30);
	}
</script>
</head>
<body>
	<div id="sun">
		<img src="../sun.png" width="150" height="150">
	</div>
	<div id="earth">
		<img src="../earth.png" width="50" height="50">
	</div>
	<div id="moon">
		<img src="../moon.png" width="20" height="20">
	</div>
</body>
</html>