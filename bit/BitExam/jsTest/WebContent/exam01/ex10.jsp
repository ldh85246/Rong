<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>	<!-- jquery 세팅 -->
<script type="text/javascript">
//jQuery로 구현
$(function(){	//window.onload와 동일. function이 매개변수로 들어감.
	var data = ["행복", "돈", "소신", "휴식", "건강", "가족", "사랑", "우정", "권력", "명예"];
	$("#btn").click(function(){
		var str = "<ul>";
		$.each(data, function(idx, item){	//.each : jquery의 반복문. foreach와 비슷함. 첫 번째 매개변수 : 배열이름	두 번째 매개변수 : 함수. --> 배열의 크기만큼 함수 실행. data에서 하나씩 꺼내어 item에 담음
			str += "<li>" + idx + " " + item + "</li>";
		});	
		str += "</ul>";
		$("#result").html(str);
	});
});	

// $(function(){
// 	var data = ["행복", "돈", "소신", "휴식", "건강", "가족", "사랑", "우정", "권력", "명예"];
// 	$("#btn").click(function(){	//btn요소에 클릭이 발생했을 때 동작하는 함수 설정
// 		var str = "<ul>";
// 		$.each(data, function(idx, item){	//.each(배열, 함수(배열인덱스, 항목))
// 			str += "<li>" + item + "</li>";
// 		});	
// 		str += "</ul>";
// 		$("#result").html(str);
// 	});	

// });
</script>
</head>
<body>
	<button id="btn">노드생성</button><!-- input type=button 과 동일 -->
	<hr>
	<div id="result"></div>
</body>
</html>