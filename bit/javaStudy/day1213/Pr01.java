import java.util.Scanner;

class Pr02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int correctCnt = 0;
		int incorrectCnt = 0;
		String answer = "";
		String[] userAnswerList = new String[10];

		String[] question1 = {"개그맨들이 찾아서 헤매는 거리는?", "텅빈거리", "웃음거리", "충무로거리", "웃찾사", "b"};
		String[] question2 = {"하늘에서 애 낳으면?", "하이마트", "하이웨이", "하이애나", "옴메나죽어", "c"};
		String[] question3 = {"세상 사람들의 머리카락 수를 모두 곱하면?", "불계", "계산불가", "무한대", "0", "d"};
		String[] question4 = {"정말 멋진 신사가 자기 소개하는 것은?", "신사정장", "신사참배", "신사임당", "신사도", "c"};
		String[] question5 = {"거꾸로 매달린 집에 천문 만호(천 개의 문과 만개의 방)가 무엇인가?", "백악관", "63빌딩", "벌집", "청와대", "c"};
		String[] question6 = {"재수 없는데 재수 있다고 하는 것은?", "군대 입대", "대입 낙방", "급여 삭감", "승진 누락", "b"};
		String[] question7 = {"세상에서 가장 먼저 자는 가수는?", "심수봉", "토끼소녀", "조용필", "이미자", "d"};
		String[] question8 = {"날씨가 더워서 창문을 열었더니 신이 날고 있었다.\n이런 이야기를 뭐라고 할까?", "신나는 이야기", "황당한 이야기", "무서운 이야기", "무더운 이야기", "a"};
		String[] question9 = {"사람의 몸무게가 가장 많이 나갈 때는?", "밥 먹을 때", "철 들 때", "나이 먹을 때", "공부 할 때", "b"};
		String[] question10 = {"속이 끓어오르는 사람이 쓴 글은?", "싱글벙글", "이글이글", "부글부글", "방글방글", "c"};
		String[] answerList = {"b", "c", "d", "c", "c", "b", "d", "a", "b", "c"};
		String[] str = {};

		for(int i = 0; i < 10; i++){
			switch(i){
				case 0:
					str = question1;
					break;
				case 1:
					str = question2;
					break;
				case 2:
					str = question3;
					break;
				case 3:
					str = question4;
					break;
				case 4:
					str = question5;
					break;
				case 5:
					str = question6;
					break;
				case 6:
					str = question7;
					break;
				case 7:
					str = question8;
					break;
				case 8:
					str = question9;
					break;
				case 9:
					str = question10;
					break;
			}
			System.out.println("(" + (i + 1) + ") 문제 : " + str[0]);
			for(int j = 1; j < str.length - 1; j++){
				System.out.println("(" + (char)(65 + j - 1) + ")" + str[j]);
			}

			while(true){
				System.out.print("답 : ");
				answer = sc.next();

				if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c") && !answer.equals("d")){
					System.out.println("a,b,c,d 만 입력하세요");
					continue;
				}
				break;
			}
			
			userAnswerList[i] = answer;
			
		}
//		for(String strr : userAnswerList)
//			System.out.println(strr);

		int correctAnswerCnt = correctAnswers(answerList, userAnswerList);
		int incorrectAnswerCnt = incorrectAnswers(answerList, userAnswerList);
		boolean isPassed = isPassed(correctAnswerCnt);

		System.out.println("정답 횟수 : " + correctAnswerCnt);
		System.out.println("오답 횟수 : " + incorrectAnswerCnt);
		System.out.println((isPassed) ? "통과입니다" : "통과하지 못했습니다");
	}
	//학생이 시험에 통과했는지 판단
	public static boolean isPassed(int correctAnswers){
		//정답 횟수가 7이상이면 통과
		if(correctAnswers >= 7){
			return true;
		}
		return false;
	}
	//학생의 정답 횟수 판단하여 카운트
	public static int correctAnswers(String[] answerList, String[] userAnswerList){
		int cnt = 0;
		for(int i = 0; i < answerList.length; i++){
			if(answerList[i].equals(userAnswerList[i])){
				cnt++;
			}
		}
		return cnt;
	}
	//학생의 오답 횟수 판단하여 카운트
	public static int incorrectAnswers(String[] answerList, String[] userAnswerList){
		int cnt = 0;
		for(int i = 0; i < answerList.length; i++){
			if(!answerList[i].equals(userAnswerList[i])){
				cnt++;
			}
		}
		return cnt;
	}
}
