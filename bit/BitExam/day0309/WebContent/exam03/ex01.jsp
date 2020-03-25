<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr = ["축구공", "스타킹", "유니폼", "축구화"];
		var imgArr = ["../ball1.jpg", "../stock1.jpg", "../cloth1.jpg", "../shoe1.jpg"];
		document.getElementById("btnRead").onclick = function() {
			for (var i = 0; i < arr.length; i++) {
				var txtNode = document.createTextNode(arr[i]);
				var li = document.createElement("li");
				li.setAttribute("idx", i);
				li.appendChild(txtNode);
				document.getElementById("list").appendChild(li);

				li.onclick = function() {
					var idx = this.getAttribute("idx");
					document.getElementById("img").src = imgArr[idx];
				}
			}
		}
	}
</script>
</head>
<body>
	<ul id="list"></ul>
	<button id="btnRead">상품목록 읽어오기</button><br>
	<img id="img">
</body>
</html>