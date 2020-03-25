<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btnList").onclick = function() {
			var str = "";
			str += "<ul>";
			str += "<li>JavaScript</li>";	// <li>태그는 자동 줄바꿈 기능을 갖고 있다.
			str += "<li>jQuery</li>";
			str += "<li>Ajax</li>";
			str += "</ul>";
			
			// appendChild : 노드 사이에 노드를 추가해주는 개념, textnode를 생성하여 작성해야 함
			// innerHTML : 모든 타입의 문자를 추가해주는 개념
			document.getElementById("result").innerHTML = str; // 부모가 아닌 노드는 생성이 불가함
			// document.getElementById("result").appendChild(str);
		}
	}
</script>
</head>
<body>
	<div id="result"></div>
	<button id="btnList">리스트 노드 추가</button>
</body>
</html>