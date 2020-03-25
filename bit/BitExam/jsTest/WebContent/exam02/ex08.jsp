<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("btn").onclick = function(){
		var n = eval(document.getElementById("n").value);
		var tot = 0;
		for(i = 1; i <= n; i++){
			tot += i;
		}
		document.getElementById("result").innerHTML = tot;		
	}
};
</script>
</head>
<body>
<!-- 사용자한테 n을 입력받아서 1에서 n까지의 합을 누적하여
	출력하는 스크립트를 작성합니다.
 -->
 	어디까지 더할까요?
 	<input type="number" id="n">
 	<button id="btn">더하기</button>
 	<hr>
 	결과 : <div id="result"></div>
 	
</body>
</html>