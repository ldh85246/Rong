<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr = [
			{
			name : "축구공",
			fname : "../ball1.jpg"
		}, {
			name : "축구화",
			fname : "../shoe1.jpg"
		}, {
			name : "스타킹",
			fname : "../stock1.jpg"
		}, {
			name : "유니폼",
			fname : "../cloth1.jpg"
		} ];

		document.getElementById("btnRead").onclick = function() {
			for (var i = 0; i < arr.length; i++) {
				var g = arr[i];
				var txtNode = document.createTextNode(g.name);
				var li = document.createElement("li");
				li.setAttribute("idx", i);
				li.appendChild(txtNode);
				document.getElementById("list").appendChild(li);

				li.onclick = function() {
					// var fname = arr[this.getAttribute("idx")].fname;
					// document.getElementById("img").src = fname;
					document.getElementById("img").src = arr[this.getAttribute("idx")].fname;
				}
			}
		}
	}
</script>
</head>
<body>
	<ul id="list"></ul>
	<button id="btnRead">상품 읽어오기</button><br>
	<img id="img">
</body>
</html>