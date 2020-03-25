<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.active {
		background: pink
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<h2>상품관리</h2>
	<table id="tb" border="1" width="80%">
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
		</tr>
	</table>
	<br>
	<table>
		<tr>
			<td><img id="img"></td>
			<td>
				상품번호 : <span id="no"></span><br>
				상품명 : <span id="name"></span><br>
				상품가격 : <span id="price"></span><br>
				상품수량 : <span id="qty"></span><br>
				상품상세 : <span id="detail"></span><br>
			</td>
		</tr>
	</table>
</body>
</html>