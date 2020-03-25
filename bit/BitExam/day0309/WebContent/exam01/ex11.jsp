<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr = ["../cloth1.jpg", "../cloth2.jpg", "../cloth3.jpg", "../cloth4.jpg", "../cloth5.jpg"]
		document.getElementById("btnImg").onclick = function() {
			var img = document.getElementsByTagName("img");
			for(var i in img) {
				img[i].src = arr[i];
				img[i].width = 100;
				img[i].height = 100;
			}
		}
	}
</script>
</head>
<body>
	<img>
	<img>
	<img>
	<img>
	<img>
	<button id="btnImg">이미지 읽어오기</button>
</body>
</html>