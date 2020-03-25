<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var colName = ["name", "kor", "eng", "math"];
	
	document.getElementById("btnAdd").onclick = function(){
		var tr = document.createElement("tr");
		
		for(i = 0; i < colName.length; i++){
			var txt = document.getElementById(colName[i]).value;
			var td = document.createElement("td");
			var txtNode = document.createTextNode(txt);
			td.appendChild(txtNode);			
			tr.appendChild(td);
		}
		
		document.getElementById("score").appendChild(tr);
	}
}
</script>
</head>
<body>
	<table border="1" width="80%" id="score">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
		</tr>
	</table>
	<hr>
	이름 : <input type="text" id="name"><br>
	국어 : <input type="text" id="kor"><br>
	영어 : <input type="text" id="eng"><br>
	수학 : <input type="text" id="math"><br>
	<button id="btnAdd">등록</button>
</body>
</html>