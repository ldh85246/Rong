<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("btn").onclick = function() {
			var request = new XMLHttpRequest();
			
			//상태변화
			request.onreadystatechange = function(event) {	// 요청이 들어올 때마다 메소드를 실행
				
				//서버로부터 응답이 모두 완료되었는지
				if(request.readyState == 4) {				// 비동기 방식과 같이 써야 함
					
					//오류 없이 끝났는지
					if(request.status == 200) {
						var str = request.responseText;
						document.getElementById("msg").innerHTML = str;
					}
				}
			}
			
			//비동기여부를 true로 사용할 경우 onreadystatechange를 함께 사용해야 함.
			request.open("get", "hello.jsp", true);
			request.send();
		}
	}
</script>
</head>
<body>
	<textarea rows="10" cols="20"></textarea>
	<br>
	<button id="btn">Ajax 통신</button>
	<h1 id="msg"></h1>
</body>
</html>