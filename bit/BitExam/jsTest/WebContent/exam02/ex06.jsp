<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){	
	document.getElementById("btn").onclick = function(){
		document.getElementById("goods").src = "cloth1.jpg";
	}
};
</script>
</head>
<body>
	<img id="goods" src="ball1.jpg" width="100" height="100">
	<button id="btn">상품바꾸기</button>
</body>
</html>