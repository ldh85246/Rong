//학생의 점수를 입력받아 60점 이상이면 "합격"
//그렇지 않으면 "불합격"을 출력

import java.util.Scanner;

class BooleanTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		boolean isPass;
		String result;

		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		isPass = score >= 60;
		
		if (isPass)
			result = "합격입니다.";
		else
			result = "불합격입니다.";
		System.out.println("해당 학생은 " + result);
	}
}
