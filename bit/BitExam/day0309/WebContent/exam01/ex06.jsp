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
			var img = document.createElement("img");
			img.setAttribute("src", "../ball1.jpg");
			img.setAttribute("width", 100);
			img.setAttribute("height", 100);
			img.setAttribute("idx", "hi");
			// 원래는 없는 속성을 setAttribute를 통해 지정할 수 있다.
			// (img의 없는 속성들도 추가할 수 있다.)
			
			img.setAttribute("bit","hello");
			//원래는 없는 속성을 setAttribute을 통해 지정할 수 있어요.
			
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