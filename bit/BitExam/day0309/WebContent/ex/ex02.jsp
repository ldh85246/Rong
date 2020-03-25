<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr = ["java", "oracle"];
		document.getElementsByTagName("button")[0].onclick = function() {
			var h2 = document.getElementsByTagName("h2");
// 			h2[0].innerHTML = arr[0];
// 			h2[1].innerHTML = arr[1];
			for (var i in arr) {
				h2[i].innerHTML = arr[i];
			}
		}
	}
</script>
</head>
<body>
	<h2>자바</h2>
	<h2>오라클</h2>
	<button>영어로 변환</button>
</body>
</html>