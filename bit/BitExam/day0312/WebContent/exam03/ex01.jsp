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
// 			var input = $("input[type=text]");
// 							input:text	이렇게 가능
			var input = $("input");
			$(input).val("입력하세요.");	// val은 jQuery이기 때문에 $가 있어야 사용이 가능하다.
		});
	});
</script>
</head>
<body>
	이름 : <input type="text"><br>
	주소 : <input type="text"><br>
	<input id="btn" type="button" value="확인">
</body>
</html>