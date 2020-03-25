<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btnChange").onclick = function() {
			var arr = document.getElementsByTagName("h1"); // TagName은 속성이 하나라도 배열로 반환
			arr[0].innerHTML = "Java";
			arr[1].innerHTML = "Oracle";
		}
	}
</script>
</head>
<body>
	<h1>자바</h1>
	<h1>오라클</h1>
	<button id="btnChange">영어로 바꾸기</button>
</body>
</html>