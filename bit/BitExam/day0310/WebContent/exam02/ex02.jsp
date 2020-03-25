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
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=001&aid=0011461361",
					content : "(서울=연합뉴스) 홍정규 기자 = 미래통합당 경남 양산을 공천에서 배제된 홍준표 전 대표는 오는 12일까지 황교안 대표의 '결단'을 기다려보고 나서 자신의 거취를 정하겠다고 10일 밝혔다.홍 전 대표는 이날 페이스북 글에서 이번 목요일(12일) 오전 최고위원회의까지 지켜보겠다. 황 대표가 과연 큰 도량의 대장부인지 지켜보겠다며 내가 갈 정치적 방향은 황 대표의 결단에 달렸다고 말했다.경남 밀양·의령·함안·창녕에서 출마하려던 홍 전 대표는 김형오 공천관리위원장의 '서울 출마' 요구에 맞서 양산을 출마로 타협안을 제시했지만, 지난 5일 양산을 공천에서 배제됐다. 양산을은 나동연 전 양산시장과 박인·이장권 전 경남도의회 의원 등 3명의 경선 지역으로 지정됐다."
				},
				{
					title : '[단독] 200명 다닥다닥 앉은 구로 콜센터 "마스크 쓴 사람 없었다"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002982682",
					content : "서울 구로구 신도림동 콜센터에서 신종 코로나바이러스 감염증(코로나19) 확진자가 최소 41명에 이르는 가운데 집단 감염 사태가 발생한 원인에 대해 해당 콜센터를 잘 아는 A씨는 이같이 말했다.A씨는 직원들이 일상생활에서 마스크를 꼈는지는 모르겠는데 회사의 지침이 없었는지 일할 때 마스크 낀 것을 보지 못했다고 했다. 이날 중앙재난안전 대책본부 정례브리핑에서도 손영래 홍보관리반장은 콜센터의 특성상 직원들이 마스크를 쓰지 않았다고 밝혔다."
				},
				{
					title : '일주일만에 또 화격타격훈련…김정은, 마스크 벗고 "웃음"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=277&aid=0004639973",
					content : "[아시아경제 한승곤 기자] 10일 신종 코로나바이러스 감염증(코로나19) 능동감시 대상자였던 40대 신천지 여성 신도가 자신이 살던 아파트에서 투신한 것을 두고 신천지예수교 증거장막성전(신천지)은 이단 프레임이 국민을 또 죽였다고 지적했다.신천지 측은 이날 보도자료를 내고 코로나19 사태 이후 신천지에 대한 비난 여론이 커지면서 가정폭력에 시달리던 신천지 여신도가 또 사망하는 사건이 발생했다며 이같이 주장했다.이어 부부는 몇 해 전부터 종교 문제로 다툼이 있었고 최근까지도 종교 문제를 놓고 다퉜으며 남편은 신천지 신도가 아닌 것으로 알려졌다고 밝혔다.전북 정읍경찰서 등에 따르면 전날(9일) 오후 10시36분께 정읍시 수성동 한 아파트 11층에서 A씨(41·여)가 추락했다.A씨는 남편 신고를 받고 출동한 119구급대에 의해 인근 병원으로 옮겨졌지만 숨졌다.경찰은 A씨가 남편이 잠시 자리를 비운 사이 아파트 베란다에서 극단적 선택을 한 것으로 보고 있다. 현장에서 유서는 발견되지 않았다."
				},
				{
					title : '정세균 총리 "코로나 낙관하는 사람 없어, 이러쿵저러쿵 부적절"',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002982648",
					content : "정세균 총리는 10일 오전 서울 종로구 정부서울청사에서 열린 중앙재난안전대책본부 회의 모두발언에서 다행히 확진자 수가 조금씩 잦아들고 있고, 병상과 생활지원센터도 확충됐다고 밝혔다. 하지만 아직 아무도 낙관하는 사람은 없다. 해야 할 일이 너무 많다면서 (이에 대해) 이러쿵저러쿵하는 건 적절치 않다고 말했다."
				},
				{
					title : '靑 라임 녹음파일 내용 사실무근...금감원 지시 사실 없어',
					url : "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=123&aid=0002220160",
					content : "청와대는 10일 '청와대 행정관이 라임 사태를 다 막았다'는 전날 SBS 8시뉴스 보도와 관련, 녹음파일 내용은 사실무근이라고 주장했다.청와대 핵심관계자는 이날 춘추관에서 기자들과 만나 기사 속에 등장하는 (청와대) 행정관은 지금 현재 금감원 소속이다. 그런데 본인에게 확인한 결과 라임과 관련해 금감원에 어떠한 지시도 한 사실이 없다고 한다며 이같이 말했다."
				} ];

		for (var i = 0; i < newsList.length; i++) {
			var news = newsList[i];
			var li = document.createElement("li");
			var txtNode = document.createTextNode(news.title);
			li.appendChild(txtNode);
			li.setAttribute("idx", i);
			document.getElementsByTagName("ul")[0].appendChild(li);

			li.onmouseover = function() {
				var idx = this.getAttribute("idx");
				document.getElementById("content").value = newsList[idx].content;
			}
		}
	}
</script>
</head>
<body>
	<h2>오늘의 주요뉴스</h2>
	<ul></ul>
	<textarea rows="10" cols="80" id="content"></textarea>
</body>
</html>