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
			var id = document.getElementById("id").value;
			var name = document.getElementById("name").value;
			var age = document.getElementById("age").value;
			var pwd = document.getElementById("pwd").value;
			var pwdChk = document.getElementById("pwdChk").value;
			
			if (id.length < 6) {
				alert("ID는 6자 이상으로 입력해주세요.");
				return false;
			}
			if (name.length < 2) {
				alert("이름은 2자 이상으로 입력해주세요.");
				return false;
			}
			if (age == "" || isNaN(age)) {
				alert("나이는 숫자로만 입력해주세요.");
				return false;
			}
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
		아이디 : <input type="text" name="id" id="id"><br>
		이름 : <input type="text" name="name" id="name"><br>		
		나이 : <input type="text" name="age" id="age"><br>
		암호 : <input type="password" name="pwd" id="pwd"><br>
		암호확인 : <input type="password" id="pwdChk"><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>