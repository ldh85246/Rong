<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//javascript로 구현
	window.onload = function(){	//윈도우가 만들어질 때(만들어지고 나서?) 동작하도록 window.onload에 함수전달. $(function(){};) 과 동일
		document.getElementById("btn").onclick = function(){
// 			alert("ok");
			var r = "";
			r += "<ul>";
			r += "<li>행복</li>";
			r += "<li>돈</li>";
			r += "<li>소신</li>";
			r += "<li>휴식</li>";
			r += "<li>건강</li>";
			r += "<li>가족</li>";
			r += "</ul>";
			
			document.getElementById("result").innerHTML = r;
		};	
	}
// 	document.getElementById("btn").onclick = function(){
// 		alert("ok");
// 	};
</script>
</head>
<body>
	<button id="btn">노드생성</button><!-- input type=button 과 동일 -->
	<hr>
	<div id="result"></div>
</body>
</html>