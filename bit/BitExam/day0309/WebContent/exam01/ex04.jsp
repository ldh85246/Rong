<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// 버튼을 누르면 처음에는 없던 h1 태그가 생겨요!

	window.onload = function() {
	// body의 태그들이 모두 만들어지고 난 다음에 동작해요.
	
		var btnAdd = document.getElementById("btnAdd");
		// id가 btnAdd인 노드를 찾아서 변수 btnAdd에 담아요.
		
		btnAdd.onclick = function() {
		// 버튼이 눌리어지는 이벤트를 설정해요.
			
			var h1 = document.createElement("h1");
			// h1태그를 하나 만들어요. 객체=노드
			
			var txt = document.createTextNode("안녕");
			// 위에서 만든 h1노드에 들어갈 글자 노드를 만들어요.
			
			h1.appendChild(txt);
			// h1노드에 글자노드를 담아요.
			// appendChild는 노드안에 노드를 넣어줌
			
			document.getElementById("result").appendChild(h1);
			// id가 result인 노드를 찾아서 h1노드에 담아요.
		}
		// var는 모든 변수를 담아주는 변수
	}
</script>
</head>
<body>
	<div id="result"></div>
	<!-- 동적으로 태그를 만들어 담을 공간을 만들고 id를 설정해요 -->
	
	<button id="btnAdd">노드추가</button>
	<!-- 자바스크립트에서는 찾을 수 있도록 id를 설정해요 -->
</body>
</html>