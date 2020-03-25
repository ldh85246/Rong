<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.border {
		border: 2px solid black;
		border-radius: 15px;
		width: 200px;
		height: 200px;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var str = "<member_list>";
		str += "<member>";
		str += "<name>서동욱</name>";
		str += "<address>대한민국 안양</address>";
		str += "</member>";
		
		str += "<member>";
		str += "<name>홍길동</name>";
		str += "<address>대한민국 제주도</address>";
		str += "</member>";
		
		str += "<member>";
		str += "<name>유관순</name>";
		str += "<address>대한민국 천안</address>";
		str += "</member>";
		str += "</member_list>";
		
		var xmlDoc = $.parseXML(str);

		var memberList = $(xmlDoc).find("member");
		$.each(memberList, function(idx, member) {
			var div = $("<div></div>").addClass("border");
			var h2 = $("<h2></h2>").html($(this).find("name").text());
			var p = $("<p></p>").html($(this).find("address").text());
			$(div).append(h2, p);
			$("body").append(div);
		});
	});
</script>
</head>
<body>
	
</body>
</html>