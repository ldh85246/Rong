<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var age = 20;
	var name = "홍길동";
	var height = 178.5;
	var arr = ["사랑", "우정", "건강", "가족"];
	var person = {name : "홍길동", age : 20};	//javascript에서의 객체. 이러한 형태{key1:value1, key2:value2}를 json(JavaScript Object Notation)형태라고 함.
	str = "age의 자료형 : " + typeof(age) + "\n";			//number
	str += "name의 자료형 : " + typeof(name) + "\n";		//string
	str += "height의 자료형 : " + typeof(height) + "\n";	//number
	str += "arr의 자료형 : " + typeof(arr) + "\n";			//object
	str += "person의 자료형 : " + typeof(person) + "\n";	//object
	//특이한 자료형은 object(객체)로 취급
	alert(str);
</script>
</head>
<body>

</body>
</html>