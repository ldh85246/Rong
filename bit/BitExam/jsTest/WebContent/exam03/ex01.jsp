<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//두 개의 수를 전달받아 그 중에 큰 수를 찾아 출력하는 함수
	function printMax(a, b){
		max = a;
		if(b > max){
			max = b;
		}
		alert(max);
	}
	printMax(7, 5);
</script>
</head>
<body>

</body>
</html>