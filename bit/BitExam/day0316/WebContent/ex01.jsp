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
			
			// Ajax 방식 시작
			var request = new XMLHttpRequest();			// xml을 받아오는 기능
			request.open("get", "hello.jsp", false);	// 전송방식, 읽어올 액션, 동기or비동기
			request.send();
			var str = request.responseText;				// text타입만 반환
// 			alert(str);
			document.getElementById("msg").innerHTML = str;
		}
	}
</script>
</head>
<body>
	<button id="btn">Ajax 통신</button>
	<h2 id="msg"></h2>
</body>
</html>