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
		var item = document.getElementById("item").value;	//input text 값
		var li = document.createElement("li");			//li라는 태그를 만듦
		var txt = document.createTextNode(item);		//item에 있는 내용으로 텍스트 노드를 만듦
		li.appendChild(txt);						//만들어진 li라는 태그에 txt라는 하위 텍스트노드를 추가
		document.getElementById("list").appendChild(li);	//list라는 이름을 가진 태그에 하위 노드로 li 추가
	}
}
</script>
</head>
<body>
	<h2>인생에서 중요하게 여기는 것</h2>
	<ul id="list"></ul>
	<input type="text" id="item">
	<button id="btn">입력</button>
</body>
</html>