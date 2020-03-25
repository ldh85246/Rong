<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("joinForm").onsubmit = function() {
			var pwd = document.getElementById("pwd").value;
			var pwdChk = document.getElementById("pwdChk").value;
			
			if (pwd.length < 8) {
				alert("비밀번호는 8자 이상으로 입력해주세요.");
				return false;
			}
			if (pwd != pwdChk) {
				alert("비밀번호가 일치하지 않습니다.");
				return false;
			}
		}
	}
</script>
</head>
<body>
	<h2>회원가입</h2>
	<form id="joinForm" action="joinResult.jsp" method="post">
		아이디 : <input type="text" name="id" id="id" minlength="6" required="required"><br>
		이름 : <input type="text" name="name" id="name" minlength="2" required="required"><br>		
		나이 : <input type="number" name="age" id="age" required="required"><br>
		암호 : <input type="password" name="pwd" id="pwd" required="required"><br>
		암호확인 : <input type="password" id="pwdChk" required="required"><br>
		<!-- size="" maxlength="" min="" max="" -->
		<input type="submit" value="가입">
	</form>
</body>
</html>