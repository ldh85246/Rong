<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var menuImg = ["../mnAdd.png", "../mnUpdate.png", "../mnDelete.png"];
		var menuImgUp = ["../mnAddUp.png", "../mnUpdateUp.png", "../mnDeleteUp.png"];

		var menu = document.getElementsByClassName("menu");
		for (var i = 0; i < menu.length; i++) {
			menu[i].setAttribute("idx", i);
			menu[i].onmouseover = function() {
				var idx = this.getAttribute("idx");
				this.src = menuImgUp[idx];
			}
			menu[i].onmouseleave = function() {
				var idx = this.getAttribute("idx");
				this.src = menuImg[idx];
			}
		}

	}
</script>
</head>
<body>
	<img class="menu" src="../mnAdd.png">
	<img class="menu" src="../mnUpdate.png">
	<img class="menu" src="../mnDelete.png">
</body>
</html>