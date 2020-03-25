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
		var i;
		for (i = 0; i < menu.length; i++) {
			menu[i].onmouseover = function() {
				console.log(i);
				this.src = menuImgUp[i];
			}
			menu[i].onmouseleave = function() {
				console.log(i);
				this.src = menuImg[i];
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