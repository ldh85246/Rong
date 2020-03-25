<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//객체 생성 후 각 요소 접근
	var dept = {
		dno:100
		, dname:"도토리"
		, dloc:"서울"
	};
	alert(dept.dno);
	alert(dept['dname']);
	alert(dept["dloc"]);
</script>
</head>
<body>

</body>
</html>