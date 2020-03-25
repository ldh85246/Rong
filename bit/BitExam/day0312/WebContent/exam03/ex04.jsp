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
		setTimeout(function() {
			var str = $("select > option:selected").val();
			alert(str);
		}, 5000);
	});
</script>
</head>
<body>
	<select>
		<option>사과</option>
		<option>포도</option>
		<option>딸기</option>
	</select>
</body>
</html>