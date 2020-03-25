<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btnTeam1").click(function(){
			$(".student").css("background", "white");
			$(".team1").css("background", "yellow");	
		});
		
		$("#btnTeam2").click(function(){
			$(".student").css("background", "white");
			$(".team2").css("background", "yellow");	
		});
			
		$("#btnMgr").click(function(){
			$(".student").css("background", "white");
			$(".manager").css("background", "yellow");	
		});
		
		$("#btnMgr1").click(function(){		
			$(".student").css("background", "white");
			$(".manager.team1").css("background", "yellow");
			// 클래스면 .을 꼭넣자!!! 클래스 다중선택시 띄어쓰기 하면 안됨
		});
		
		$("#btnMgr2").click(function(){
			$(".student").css("background", "white");
			$(".manager.team2").css("background", "yellow");	
		});
	});
</script>
</head>
<body>	
	<p class="student team2">1.고요한</p>
	<p class="student team2">2.곽설아</p>
	<p class="student team1">3.김정규</p>
	<p class="student team2">4.김혜선</p>
	<p class="student team2">5.박도형</p>
	<p class="student team1">6.박유철</p>
	<p class="student team1">7.서동욱</p>
	<p class="student team2">8.유현성</p>
	<p class="student team2 manager">9.이근희</p>
	<p class="student team1 manager">10.이동현</p>
	<p class="student team1">11.이종호</p>
	<p class="student team1">12.전은진</p>
	<p class="student team2">13.하지연</p>
	<p class="student team1">14.홍수지</p>
	
	<button id="btnTeam1">팀1의 구성원</button>
	<button id="btnTeam2">팀2의 구성원</button>
	<button id="btnMgr">모든 관리자</button>
	<button id="btnMgr1">팀1의 관리자</button>
	<button id="btnMgr2">팀2의 관리자</button>
</body>
</html>