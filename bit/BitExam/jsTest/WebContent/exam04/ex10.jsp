<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var myWindow;
	document.getElementById("btnNew").onclick = function(){
		myWindow = window.open("","", 'width=400, height=400');
	}
	document.getElementById("btnPrint").onclick = function(){
		myWindow.document.write("<h2>hello</h2>");
	}
};
</script>
</head>
<body>
	<button id="btnNew">새 창 열기</button>
	<button id="btnPrint">새 창에 내용 출력</button>
</body>
</html>