<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var data = ["이동현", "30세", "서울시 양천구 신월동", "010-7773-3750"];
		document.getElementById("btnData").onclick = function() {
			var td = document.getElementsByTagName("td");
			for(var i in td) {
				td[i].innerHTML = data[i];
			}
		}
	}
</script>
</head>
<body>
<table border="1" width="80%">
	<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
</table>
<button id="btnData">데이터 출력</button>
</body>
</html>