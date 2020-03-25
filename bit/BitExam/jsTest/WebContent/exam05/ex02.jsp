<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("info").innerHTML = navigator.userAgent;
};
</script>
</head>
<body>
	접속한 브라우저 정보 : <span id="info"></span>
</body>
</html>