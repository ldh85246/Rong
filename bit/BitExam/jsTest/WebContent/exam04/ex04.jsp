<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//3초뒤 한번 실행되는 타이머 예제
	window.onload = function(){
		setTimeout(function(){
			var today = new Date();
			document.getElementById("result").innerHTML = today;
		}, 3000);
	}
</script>
</head>
<body>
	현재시간 : <span id="result"></span>
</body>
</html>