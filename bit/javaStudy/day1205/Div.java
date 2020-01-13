/*
연습) 사용자로부터 두개의 정수를 입력받아 나누기 한 결과를 출력하세요.
(클래스명, 변수명 등은 자유롭게 하고 나누기 결과는 실수값으로 출력합니다.)
*/

import java.util.Scanner;

class Div{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("첫번째 정수를 입력하세요.");
		i = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		j = scan.nextInt();

		double div = (double) i / j;
		System.out.printf("두 정수를 실수로 나눈 결과값은 %.2f입니다.", div);
	}
}
