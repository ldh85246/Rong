<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("btnMove").onclick = function(){
		location.href = "http://www.hanbit.co.kr";	//location : 다른 url로 이동
	}
};
</script>
</head>
<body>
	<button id="btnMove">한빛출판사로 이동</button>
</body>
</html>