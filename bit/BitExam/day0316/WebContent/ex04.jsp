<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			
			// 요청할 페이지명, 성공시 처리할 함수
			$.ajax("hello.jsp", {seccess:function(data) {	// data = responseText
				$("#msg").html(data);
			}});
		});
	});
</script>
</head>
<body>
	<textarea rows="10" cols="60"></textarea>
	<br>
	<button id="btn">Ajax 통신</button>
	<h2 id="msg"></h2>
</body>
</html>