<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var newsList = [
				{
					title : '홍준표 "내 거취, 황교안 결단에 달려…12일까지 지켜보겠다"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=001&aid=0011461361"
				},
				{
					title : '[단독] 200명 다닥다닥 앉은 구로 콜센터 "마스크 쓴 사람 없었다"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002982682"
				},
				{
					title : '일주일만에 또 화격타격훈련…김정은, 마스크 벗고 "웃음"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=277&aid=0004639973"
				},
				{
					title : '정세균 총리 "코로나 낙관하는 사람 없어, 이러쿵저러쿵 부적절"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002982648"
				},
				{
					title : '靑 라임 녹음파일 내용 사실무근...금감원 지시 사실 없어',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=123&aid=0002220160"
				}, ];

		for (var i = 0; i < newsList.length; i++) {
			var news = newsList[i];
			var li = document.createElement("li");
			var txtNode = document.createTextNode(news.title);

			var a = document.createElement("a");
			a.appendChild(txtNode);
			a.href = news.url;
			li.appendChild(a);

			document.getElementsByTagName("ul")[0].appendChild(li);
		}
	}
</script>
</head>
<body>
	<h2>오늘의 주요뉴스</h2>
	<ul></ul>
</body>
</html>