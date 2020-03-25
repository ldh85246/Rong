<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.highlight{
		background: yellow;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".member").hover(function() {
			$(this).addClass("highlight");		// css에 정의한 클래스명을 전달해서 클래스 추가
		}, function() {
			$(this).removeClass("highlight");	// css에 정의한 클래스명을 전달해서 클래스 삭제
		});
		
		/*
		$(".member").mouseenter(function() {
// 			$("tr").css("background", "white");
			$(this).css("background", "yellow");
		});
		$(".member").mouseleave(function() {
			$(this).css("background", "white");
		});
		*/
	});
</script>
</head>
<body>
	<table border="1" width="80%">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr class="member"><td>홍길동</td><td>100</td><td>90</td><td>80</td></tr>
		<tr class="member"><td>이순신</td><td>90</td><td>80</td><td>100</td></tr>
		<tr class="member"><td>유관순</td><td>80</td><td>100</td><td>90</td></tr>
	</table>
</body>
</html>