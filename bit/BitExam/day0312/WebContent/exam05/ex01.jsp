<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.high_light {
		background: yellow;
	}
	
	.active {
		background: pink; 
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function() {
	var tdList;
	var inputList;
	
	$("#btnAdd").click(function() {
		var tr = $("<tr></tr>").addClass("member");
		$(tr).click(function() {
			$("tr").removeClass("active");		// ()는 
			$(this).addClass("active");
			tdList = $(this).find("td");
			inputList = $("input[type=text]");
			$.each(tdList, function(idx, td) {
					$(inputList[idx]).val($(this).html());
			});
		});
		$(tr).hover(function() {
			$(this).addClass("high_light");
		}, function() {
			$(this).removeClass("high_light");
		});
		$.each(inputList, function(idx, item) {
			$(tr).append($("<td></td>").html($(item).val()));
			
		});
		$("#tb").append(tr);
	});
	
	$("#btnUpdate").click(function() {
		$.each(inputList, function(idx, item) {
			$(tdList[idx]).html($(this).val());
		});
	});
	
	$(".member").hover(function() {
		$(this).addClass("high_light");
	},function() {
		$(this).removeClass("high_light");
	});
	
		$(".member").click(function() {
		$(".member").removeClass("active");
		$(this).addClass("active");
		tdList = $(this).find("td");
		inputList = $("input[type=text]");
		$.each(tdList, function(idx, td) {
				$(inputList[idx]).val($(this).html());
		});
	});
});
</script>
</head>
<body>
	<table id="tb" width="80%">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td></tr>
		<tr class="member"><td>홍길동</td><td>80</td><td>80</td><td>70</td></tr>
		<tr class="member"><td>이순신</td><td>90</td><td>90</td><td>90</td></tr>
		<tr class="member"><td>유관순</td><td>70</td><td>80</td><td>100</td></tr>
		<tr class="member"><td>김유신</td><td>100</td><td>75</td><td>40</td></tr>
		<tr class="member"><td>강감찬</td><td>90</td><td>60</td><td>100</td></tr>
	</table>
	
	이름 : <input type="text"><br>
	국어 : <input type="text"><br>
	영어 : <input type="text"><br>
	수학 : <input type="text"><br>
	<input id="btnAdd" type="button" value="등록">
	<input id="btnUpdate" type="button" value="수정">
	<input id="btnDel" type="button" value="삭제">
</body>
</html>