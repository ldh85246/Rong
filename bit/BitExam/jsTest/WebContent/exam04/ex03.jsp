<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//객체의 배열
	var arr = [				//객체 3개를 배열로 갖는 변수 arr
		{
			name:"홍길동"
			, kor:100
			, eng:100
			, math:100
		}
		, {
			name:"이순신"
				, kor:80
				, eng:40
				, math:80
		}
		, {
			name:"유관순"
				, kor:70
				, eng:30
				, math:90
		}
	];
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			var str = "<table>";
			for(i = 0; i < arr.length; i++){
				var student = arr[i];
				str += "<tr>";
				str += "<td>" + student["name"] + "</td>";
				str += "<td>" + student["kor"] + "</td>";
				str += "<td>" + student["eng"] + "</td>";
				str += "<td>" + student["math"] + "</td>";
				str += "</tr>";
			}
			str += "</table>";
			document.getElementById("result").innerHTML = str;
		};
	};
</script>
</head>
<body>
	<h2>학생 정보</h2>
	<div id="result"></div>
	<button id="btn">출력</button>
</body>
</html>