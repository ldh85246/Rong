<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var g = {
		no : 1,
		name : "옷1",
		price : 1000,
		fname : "../cloth1.jpg"
	};
	// alert(g["name"]);
	for ( var a in g) {
		alert(a);
	}
</script>
</head>
<body>

</body>
</html>