<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var today = new Date();
		var hour = today.getHours();
		if(hour >= 7 && hour <= 17){
			document.getElementById("time").src = "sun.jpg";
		}
	};
</script>
</head>
<body>
	<img src="moon.jpg" id="time" width="50%" height="50%">
</body>
</html>