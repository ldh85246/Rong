<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var arr = [ {
			no : 1,
			name : "옷1",
			qty : 10,
			price : 1000,
			fname : "../cloth1.jpg"
		}, {
			no : 2,
			name : "옷2",
			qty : 10,
			price : 1200,
			fname : "../cloth2.jpg"
		}, {
			no : 3,
			name : "옷3",
			qty : 10,
			price : 1500,
			fname : "../cloth3.jpg"
		}, {
			no : 4,
			name : "옷4",
			qty : 10,
			price : 2000,
			fname : "../cloth4.jpg"
		}, {
			no : 5,
			name : "옷5",
			qty : 10,
			price : 6000,
			fname : "../cloth5.jpg"
		} ]

		document.getElementsByTagName("button")[0].onclick = function() {
			for (var i = 0; i < arr.length; i++) {
				var tr = document.createElement("tr");
				var g = arr[i];
				for ( var a in g) {
					var td = document.createElement("td");
					if (a == "fname") {
						var img = document.createElement("img");
						img.src = g[a];
						img.width = 50;
						img.height = 50;
						td.appendChild(img);
					} else {
						var txtNode = document.createTextNode(g[a]);
						td.appendChild(txtNode);
					}
					tr.appendChild(td);
				}
				document.getElementsByTagName("table")[0].appendChild(tr);
			}
		};
	}
</script>
</head>
<body>
	<h2>장바구니 목록</h2>
	<table border="1" width="80%">
		<tr>
			<td>상품번호</td>
			<td>상품명</td>
			<td>수량</td>
			<td>가격</td>
			<td>사진</td>
		</tr>
	</table>
	<button>장바구니 목록 읽어오기</button>
</body>
</html>