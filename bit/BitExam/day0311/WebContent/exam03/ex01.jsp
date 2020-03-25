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
			var h1 = document.createElement("h1");
			var txtNode = document.createTextNode("Hello");
			h1.appendChild(txtNode);
			document.getElementById("result").appendChild(h1);
			this.onclick = null;	// 이벤트 제거
		}
	}
</script>
</head>
<body>
	<div id="result"></div>
	<button id="btn">노드 추가</button>
</body>
</html>