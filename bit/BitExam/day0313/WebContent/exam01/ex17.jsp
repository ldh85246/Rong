<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.active{
		background: yellow;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var selH2;		
		
		$("h2").click(function() {
			$("h2").removeClass("active");
			$(this).addClass("active");
			selH2 = $(this);
			$("#input").val($(this).text());
		});
		
		$("h2").dblclick(function() {
			$(this).remove();
		});
		
		$("#addTeam1").click(function() {
			var h2 = $("<h2></h2>").html($("#input").val());
			$(h2).click(function(){
				 $("h2").removeClass("active");
				 $(this).addClass("active");
			 });
			$(h2).dblclick(function() {
				$(this).remove();
			});
			$("#team1").append(h2);
		});
		$("#addTeam2").click(function() {
			var h2 = $("<h2></h2>").html($("#input").val());
			$(h2).click(function(){
				 $("h2").removeClass("active");
				 $(this).addClass("active");
			 });
			$(h2).dblclick(function() {
				$(this).remove();
			});
			$("#team2").append(h2);
		});
		
		$("#btnUpate").click(function(){
			$(selH2).html( $("#input").val());
		});
		
		$("#delTeam1").click(function() {
			$("#team1").empty();
		});
		$("#delTeam2").click(function() {
			$("#team2").empty();
		});
	});
</script>
</head>
<body>
	<h1>팀1의 구성원</h1>
	<div id="team1">
		<h2>홍길동</h2>
		<h2>이순신</h2>
		<h2>유관순</h2>
	</div>
	<hr>
	<h1>팀2의 구성원</h1>
	<div id="team2">
		<h2>강감찬</h2>
		<h2>김유신</h2>
		<h2>안철수</h2>
	</div>
	
	<input id="input" type="text"><br>
	선택한 팀원을 수정하려면 수정 버튼을, 삭제하려면 더블 클릭시 삭제 됩니다.<br>
	<button id="btnUpate">수정</button><br>
	팀1 <button id="addTeam1">추가</button><button id="delTeam1">모두 삭제</button><br>
	
	팀2 <button id="addTeam2">추가</button><button id="delTeam2">모두 삭제</button><br>
</body>
</html>