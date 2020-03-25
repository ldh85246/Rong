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
			var request = new XMLHttpRequest();
			request.open("get", "hello.jsp", false);
			request.send();
			var str = request.responseText;
			document.getElementById("msg").innerHTML = str;
		}
	}
</script>
</head>
<body>
	<textarea rows="10" cols="20"></textarea>
	<br>
	<button id="btn">Ajax 통신</button>
	<h1 id="msg"></h1>
</body>
</html>