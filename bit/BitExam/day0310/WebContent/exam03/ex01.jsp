<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../bit.js"></script>
<script type="text/javascript">
window.onload = function() {
// 	var a = nextRandomInteger(10);
// 	alert(a);
// 	var a = randomAlphabet();
// 	alert(a);
// 	var a = randomSpeed(10);
// 	alert(a);
	var a = new MovingText();
	setInterval(function(){
		a.move();
	}, 100)
}
</script>
</head>
<body>

</body>
</html>