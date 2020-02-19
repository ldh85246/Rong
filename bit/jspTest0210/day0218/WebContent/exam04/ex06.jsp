<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	<!-- 가로 메뉴로 변경 해 봅니다 -->

	html,body{
		margin: 0px;
		padding: 0px;
	}
	
	ul{
		list-style: none;
	}
	
	a{
		text-decoration: none;
		color: #fff;
		font-size: 20px;
		text-transform: uppercase;
	}
	
	li{
		float:left;
		margin-right:5px;
		background: #000;
		width: 250px;
		padding: 20px;
		border-top: solid 5px #dfdfdf;
		
		transition: background 0.2s, margin-left 0.5s;
	}
	
	li:hover{
		background: gray;
		margin-top: 10px;
	}
</style>
</head>
<body>
	<nav>
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
			<li><a href="#">Portfolio</a></li>
			<li><a href="#">Sing in</a></li>
		</ul>
	</nav>
</body>
</html>












