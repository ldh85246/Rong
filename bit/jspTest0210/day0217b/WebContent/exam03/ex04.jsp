<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#box1{
		width: 500px;
		height: 200px;
		background: gray;
	}
	
	#parent{
		width: 500px;
		height: 500px;
		background: yellow;
	}
	
	#child{
		margin-top:200px;
		width: 200px;
		height: 200px;
		background: blue;
	}
	
	#box2{
		width: 500px;
		height: 2000px;
		background: pink;
	}
</style>
</head>
<body>
	<div id="box1"></div>
	<div id="parent">
		<div id="child"></div>
	</div>
	<div id="box2"></div>
</body>
</html>












