<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//뉴스 배열 예습
	var news = [
		"태양 극지에 대한 궁금증 풀리나?\n	‘솔라 오비터(Solar Orbiter)’라는 이름의 태양 탐사선은 오는 2029년까지 태양 주위를 돌면서 태양과 가장 가까운 행성인 수성 궤도를 돌면서 태양의 극지를 관찰하는 임무를 수행할 예정이다. 솔라오비터는 NASA와 ESA이 공동으로 개발한 태양 탐사선이다"
		, "새로운 우주방사선 차폐 기술\n	금속 산화물 분말을 이용해서 우주방사선을 차단하는 신기술이 개발됐다. 이 기술은 기존 방사선 차폐 기술보다 30% 이상 효율이 높아서 인공위성의 부피와 무게를 줄이거나, 비용을 절감하는 데 도움이 될 것으로 기대된다."
		, "우주 미스터리, FRB의 정체는?\n	2001년 호주 뉴사우스웨일스 주에 있는 파크스 전파망원경에서 이상한 전파가 탐지됐다. 불과 5밀리 초(1밀리 초는 1000분의 1초)라는 짧은 순간이었지만, 그 전파는 태양이 약 1만 년 동안 방출하는 에너지와 맞먹을 만큼 강력했다."
		, "태양의 자기장 극히 미약해\n		17일 ‘인디펜던트’ 지는 영국 우주국 등이 배포한 자료 등을 인용, 태양이 일으키는 자기장이 지구의 자기장에 비해 극히 미약하다는 데이터가 전송됐다고 보도했다. 자력계를 담당하고 있는 임페리얼칼리지런던의 팀 호버리(Tim Horbury) 교수의 말을 인용, “데이터 분석 결과 지구에서 측정할... "
		, "비행기로 인한 온난화를 줄일 수 있다\n		항공기가 유발하는 온난화를 줄일 수 있는 간단한 해결책이 나왔다. 영국 연구팀은 전체의 1.7%에 해당하는 항공편 운항 고도를 600m가량 올리거나 내리면 비행운으로 인한 온난화 효과가 59%까지 감소한다는 연구 결과를 내놨다."
		, "2069년 목표로 ‘광속우주선’ 개발되나\n		16일 ‘텔레그래프’ 지에 따르면 NASA 과학탐사부문 토마스 주부헨 부국장은 태양계 바깥에 있는 별에 우주선을 보낼 수 있는 ‘새로운 핵 추진 시스템(new propulsion system)’을 설계하고 있다. 현재 NASA에서 검토하고 있는 추진 시스템에는 ‘원자력 추진 우주선(nuclear-propelled spacecraft)’도 포함돼 있는 것으로 알려지고 있다."
		];
	//0.1초 마다 1글자씩 보태져서 출력되도록 합니다.
	
	window.onload = function(){
// 		var str = "";
		var i = 1;
// 		setInterval(function(){
// // 			str = document.getElementById("news").innerHTML;
// // 			document.getElementById("news").innerHTML = "";
// // 			str += news.charAt(i);
// // 			str += news.substring(i, i + 1);
// 			str += news.substr(i, 1);
// 			if(i >= news.length){
// 				str = "";
// 				i = 0;
// 			}else
// 				i++;
// 			document.getElementById("news").innerHTML = str;
			
// 		}, 100);
		setInterval(function(){
			
// 			str = document.getElementById("news").innerHTML;
// 			document.getElementById("news").innerHTML = "";
// 			str += news.charAt(i);
// 			str += news.substring(i, i + 1);
			for(j = 0; j < news.length; j++){
				var s = news[j];
				for(k = 1; k <= s.length; k++){
					var str = s.substr(0, k);
// 					i++;
					console.log(i + " " + str);
// 					if(i >= news[j].length){
// 						i = 1;
// 					}
					document.getElementById("news").innerHTML = str;
				}
			}
		}, 100);
	}
</script>
</head>
<body>
	오늘의 뉴스 : <span id="news"></span>
</body>
</html>