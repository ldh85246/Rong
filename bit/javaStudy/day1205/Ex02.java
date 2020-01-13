// 연습) 사용자한테 3개의 정수를 입력받아
//			그 중에 가장 큰 수를 찾아 출력하는 프로그램 생성

import java.util.Scanner;

class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;

		System.out.print("첫번째 수 입력 : ");
		a = scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		b = scan.nextInt();
		System.out.print("세번째 수 입력 : ");
		c = scan.nextInt();

		if (a > b)
			if (a > c)
				System.out.println("가장 큰 수는 " + a + "입니다.");
			else
			System.out.println("가장 큰 수는 " + c + "입니다.");
		else
			if (b > c)
				System.out.println("가장 큰 수는 " + b + "입니다.");
			else
				System.out.println("가장 큰 수는 " + c + "입니다.");
	}
}
