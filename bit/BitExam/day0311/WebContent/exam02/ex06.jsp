<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		// 사과를 누르면 사과&포도 둘 다 증가, 포도를 누르면 포도 증가
		var btnAddA = document.getElementById("btnAddA");
		var btnAddG = document.getElementById("btnAddG");
		var cntA = document.getElementById("cntA");
		var cntG = document.getElementById("cntG");
		var appleCount = 0;
		var grapeCount = 0;

		btnAddA.onclick = function() {
			appleCount++;
			cntA.innerHTML = appleCount;
			btnAddG.onclick();
		}

		btnAddG.onclick = function() {
			grapeCount++;
			cntG.innerHTML = grapeCount;
		}
	}
</script>
</head>
<body>
	<button id="btnAddA">사과</button>
	<button id="btnAddG">포도</button>
	<h1>
		사과수량 : <span id="cntA">0</span>
	</h1>
	<h1>
		포도수량 : <span id="cntG">0</span>
	</h1>
</body>
</html>