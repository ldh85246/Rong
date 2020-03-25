<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function (){
		//이벤트 연결
		$("#btnMax").click(function(){//btnMax가 클릭되었을때 동작. click함수의 매개변수로 함수를 전달
			n1 = eval($("#n1").val());	//id가 n1인 요소의 val()로 값을 받아옴
			n2 = eval($("#n2").val());
			r = n1;
			if(n2 > r)
				r = n2;
			$("#result").html(r);	
		});	
	});
</script>
</head>
<body>

	수1:<input type="text" id="n1"><br>	<!-- id는 서버로 갈 때 의미가 있음 -->	
	수2:<input type="text" id="n2"><br>
	<input type="button" id="btnMax" value="큰수찾기"><br>

	결과 : <span id="result"></span>
</body>
</html>