<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		n1 = eval(document.F.n1.value);	//문자로 취급되므로 eval()사용
		n2 = eval(document.F.n2.value);	//변수명 앞에 int 키워드를 사용할 수 없으며, var를 사용하지만 생략가능. 
		r = n1 + n2;
// 		alert(r);
		//input 태그는 value를 사용하지만 그 외는 innerHTML 사용
		document.getElementById("result").innerHTML = r;
	}
	//Uncaught TypeError: max is not a function --> max가 키워드로 이미 존재하므로 다른 이름으로 사용
	 
	function my_max(){
		var n1 = eval(document.F.n1.value);
		var n2 = eval(document.F.n2.value);
		var r = n1;
		if(r < n2){
			r = n2;
		}
		document.getElementById("result").innerHTML = r;
	}
</script>
</head>
<body>
<!-- form 태그가 있어도 되고 없어도 됨 -->
	<form name="F">
		수1:<input type="text" name="n1"><br>
		수2:<input type="text" name="n2"><br>
		<input type="button" value="큰수찾기" onclick="my_max()"><br>
	</form>
	결과 : <span id="result"></span>
</body>
</html>