<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var news = "다음주부터 1주일간 코로나19로 인하여 휴강입니다. 모두 집에서 안전하게 학습하도록 합니다.";
	//0.1초 마다 1글자씩 보태져서 출력되도록 합니다.
	
	window.onload = function(){
// 		var str = "";
		var i = 1;
// 		setInterval(function(){
// // 			str = document.getElementById("news").innerHTML;
// // 			document.getElementById("news").innerHTML = "";
// // 			str += news.charAt(i);
// // 			str += news.substring(i, i + 1);
// 			str += news.substr(i, 1);
// 			if(i >= news.length){
// 				str = "";
// 				i = 0;
// 			}else
// 				i++;
// 			document.getElementById("news").innerHTML = str;
			
// 		}, 100);
		setInterval(function(){
// 			str = document.getElementById("news").innerHTML;
// 			document.getElementById("news").innerHTML = "";
// 			str += news.charAt(i);
// 			str += news.substring(i, i + 1);
			var str = news.substr(0, i);
			i++;
			if(i >= news.length){
				i = 1;
			}
			document.getElementById("news").innerHTML = str;
			
		}, 100);
	}
</script>
</head>
<body>
	오늘의 뉴스 : <span id="news"></span>
</body>
</html>