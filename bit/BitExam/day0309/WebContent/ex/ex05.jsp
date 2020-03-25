<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btnAdd").onclick = function() {
			var li = document.createElement("li");
			var input = document.getElementsByTagName("input")[0].value;
			document.getElementsByTagName("ul")[0].appendChild(li).innerHTML = input;
			li.onclick = function() {
				alert(this.innerText);
			}
		}
	}
</script>
</head>
<body>
	<ul></ul>
	<input type="text">
	<button id="btnAdd">추가</button>
</body>
</html>