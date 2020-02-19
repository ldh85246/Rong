<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#first{
		width: 100px;
		height: 100px;
		background: orange;
		position: absolute;
		left: 0px;
		top: 0px;
	}
	#second{
		width: 100px;
		height: 100px;
		background: red;
		position: absolute;
		left: 50px;
		top: 50px;
		z-index: 100;
	}
	#third{
		width: 100px;
		height: 100px;
		background: blue;
		position: absolute;
		left: 100px;
		top: 100px;
	}
	
	
</style>
</head>
<body>
	<div id="first"></div>
	<div id="second"></div>
	<div id="third"></div>
</body>
</html>






