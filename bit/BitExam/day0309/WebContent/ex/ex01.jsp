<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btn").onclick = function() {
			var div = document.getElementById("div");
			var h2 = document.createElement("h2");
			var txtNode = document.createTextNode("txt");
			h2.appendChild(txtNode);
			div.appendChild(h2);
		}
	}
</script>
</head>
<body>
	<div id="div"></div>
	<button id="btn">클릭</button>
</body>
</html>