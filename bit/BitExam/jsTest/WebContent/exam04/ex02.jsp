<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//객체의 속성 정보를 html노드에 적용
	var goods = {
		no:1
		, item:"나이키 축구공"
		, price:10000
		, qty:10
		, fname:"ball1.jpg"
		, detail:"좋은 공입니다."
	};
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			document.getElementById("no").innerHTML = goods["no"];
			document.getElementById("item").innerHTML = goods["item"];
			document.getElementById("qty").innerHTML = goods["qty"];
			document.getElementById("price").innerHTML = goods["price"];
			document.getElementById("fname").src = goods["fname"];
			document.getElementById("detail").value = goods["detail"];
		}
	};
</script>
</head>
<body>
	상품번호 : <span id="no"></span><br>
	상품명 : <span id="item"></span><br>
	수량 : <span id="qty"></span><br>
	가격 : <span id="price"></span><br>
	상품이미지 : <img  id="fname" src=""><br>
	상세설명 : <textarea id="detail" rows="" cols=""></textarea><br>
	<button id="btn">상품정보 출력</button>
</body>
</html>