<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	#ball{
		background-image:url(ball1.jpg);
		background-repeat:no-repeat;
		position:absolute;
		left:10px;
		top:10px;
		
		width: 100px;
		height: 100px;
		
		animation-name:ballMove;
		animation-duration:3s;
		animation-timing-function:ease;
		animation-delay:1s;
		animation-iteration-count:2;
		animation-direction:alternate;
		
	}
	
	@keyframes ballMove{
		from {
			left:10px;
			transform:rotate(0deg);
			width: 100px;
			height: 100px;
			background-image:url(ball1.jpg);
		}
		to {
			left:1000px;
			transform:rotate(360deg);
			width: 150px;
			height: 150px;
			background-image:url(ball2.jpg);
		}
	}
	
	
</style>
</head>
<body>
	<div id="ball"></div>
	
</body>
</html>








