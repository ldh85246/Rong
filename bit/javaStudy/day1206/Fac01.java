/*
ex) 사용자한테 임의의 수 n을 입력받아 n!을 구하여 출력하는 프로그램을 생성 및 실행
	<< 실행 예 >>
	n을 입력하세요 ==> 5
	5 * 4 * 3 * 2 * 1 =__
*/

import java.util.Scanner;

class Fac01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j = 1;

		System.out.println("*** 팩토리얼 출력 시스템 ***");
		System.out.print("n을 입력하세요 ==> ");
		int n = scan.nextInt();

		for (i = n; i >= 1; i--) {
			j *= i;
		} System.out.print("n의 값은 : " + j + "입니다.");
	}
}
