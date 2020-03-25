<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//n을 매개변수로 전달받아 1 ~ n까지의 합을 누적하여 반환하는 함수
	var getSum = function(n){
		var tot = 0;
		for(i = 1; i <= n; i++){
			tot += i;
		}
		return tot;
	}
	alert(getSum(10));
</script>
</head>
<body>

</body>
</html>