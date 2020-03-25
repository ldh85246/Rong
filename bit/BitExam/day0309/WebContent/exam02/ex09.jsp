<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var selLi;
		var input = document.getElementById("input");
		
		document.getElementById("btnDelete").onclick = function(){
			// document.getElementById("list").removeChild(selLi);
			selLi.parentNode.removeChild(selLi);
		}
		
		document.getElementById("btnUpdate").onclick = function(){
			selLi.innerHTML = input.value;
		}
		
		document.getElementById("btnAdd").onclick = function() {
			var str = document.getElementById("input").value;
			var txtNode = document.createTextNode(str);
			var li = document.createElement("li");
			
			li.onclick = function() {
				input.value = this.innerHTML;
				
				var liList = document.getElementsByTagName("li");
				for(var i=0;i<liList.length;i++){
					liList // [i].style.background = "white";
				}
				
				selLi = this;
				this.style.background = "yellow";
			}
			
			li.appendChild(txtNode);
			document.getElementById("list").appendChild(li);
		}
	}
</script>
</head>
<body>
	<h2>직장인이 좋아하는 점심메뉴</h2>
	<ul id="list"></ul>
	<input type="text" id="input">
	<button id="btnAdd">등록</button>
	<button id="btnUpdate">수정</button>
	<button id="btnDelete">삭제</button>
</body>
</html>