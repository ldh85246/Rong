/*
사용자한테 두개의 정수를 입력받아
사칙연산을 수행한 결과를 출력하는 프로그램

	<< 실행 예 >>
	첫번째 수를 입력하세요? : 4
	두번째 수를 입력하세요? : 2
	4 + 2 = __
	4 - 2 = __
	4 * 2 = __
	4 / 2 = __
*/

import java.util.Scanner;

class CalcTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, add, sub, mul;
		double div;
		System.out.println("첫번째 수를 입력하세요? : ");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요? : ");
		b = sc.nextInt();
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = (double)a / b;
		System.out.printf("%d + %d = %d\n", a, b, add);
		System.out.printf("%d - %d = %d\n", a, b, sub);
		System.out.printf("%d * %d = %d\n", a, b, mul);
		System.out.printf("%d / %d = %.1f\n", a, b, div);
		//System.out.printf(a + "+" + b + "=" + add);
	}
}
