<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("myForm").onsubmit = function() {
			var pwd = document.getElementById("pwd").value;
			var pwdChk = document.getElementById("pwdChk").value;
			if (pwd != pwdChk) {
				alert("비밀번호 확인 필요!");
				return false;
			}
			if (pwd == "" || pwdChk == "") {
				alert("비밀번호를 입력하세요.");
				return false;
			}
		}
	}
</script>
</head>
<body>
	<form id="myForm" action="hello.jsp" method="post">
		암호 : <input id="pwd" type="password"><br>
		암호 확인 : <input id="pwdChk" type="password"><br>
		암호 : <input type="submit" value="확인">		
	</form>
</body>
</html>