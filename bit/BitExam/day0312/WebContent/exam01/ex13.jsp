<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.hl {
		background: yellow;
	}
	
	.clk {
		background: red;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".list").hover(function() {
			$(this).addClass("hl");
		}, function() {
			$(this).removeClass("hl");
		});
		
		$("li").click(function() {
			$(".list").removeClass("clk");
			$(this).addClass("clk");
			$("#re").html($(this).html());
		});
	});
</script>
</head>
<body>
	<h2>말씀</h2>
	<ul>
		<li class="list">믿음</li>
		<li class="list">소망</li>
		<li class="list">사랑</li>
	</ul>
	<span id="re"></span>
</body>
</html>