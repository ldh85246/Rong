<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var data = ["JAVA", "ORACLE", "JAVASCRIPT", "SPRING", "JQUERY", "AJAX"];
		document.getElementById("btnChange").onclick = function() {
			var arr = document.getElementsByTagName("h1");
// 			for(var i in arr) {
			for(var i = 0; i < arr.length; i++) {
				arr[i].innerHTML = data[i];
			}
		}
	}
</script>
</head>
<body>
	<h1>자바</h1>
	<h1>오라클</h1>
	<h1>자바스크립트</h1>
	<h1>스프링</h1>
	<h1>제이쿼리</h1>
	<h1>에이작스</h1>
	<button id="btnChange">영어로 바꾸기</button>
</body>
</html>