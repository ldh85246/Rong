<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	var name = ["name", "kor", "eng", "math"];
	$("#btnAdd").click(function(){
		var tr = $("<tr></tr>");
		for(i = 0; i < name.length; i++){
			var td = $("<td></td>").text($("#" + name[i]).val());	//var td1 = $("<td></td>").html($("#name").val());
			$(tr).append(td);
		}
// 		$(tr).append(td1, td2, td3, td4);
		$("#table").append(tr);	
	})
});
</script>
</head>
<body>
	<table border="1" width="80%" id="table">
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