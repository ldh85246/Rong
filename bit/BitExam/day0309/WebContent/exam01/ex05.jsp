<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btnImg").onclick = function() {
			var img = document.createElement("img");	// 노드는 태그로 주로 생성
			img.src = "ball1.jpg";	// 내장된 속성은 .으로 접근
			img.width = 100;
			img.height = 100;
			// img가 처음부터 갖고 있는 속성들(src, width, height)로만 추가가 가능하다.
			
			img.bit = "hello";		// 이 친구는 불가, 원래부터 있는 속성만 추가가 가능
			
			document.getElementById("result").appendChild(img);
		}
	}
</script>
</head>
<body>
	<div id="result"></div>
	<button id="btnImg">이미지 노드 추가</button>
</body>
</html>