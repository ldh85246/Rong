/*
ex) 사용자한테 임의의 수 n을 입력받아 1에서 n까지의 합을 누적하여
출력하는 프로그램 생성
<< 실행 예 >>
n을 입력하세요 ==> 10
1에서 10까지의 합은 __입니다.
*/

import java.util.Scanner;

class AccuTotal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하세요 ==> ");
		int n = scan.nextInt();
		int i, j = 0;

		for (i = 1; i <= n; i++) {
				j += i;
		} System.out.println("1에서 n까지의 합은 : " + j + "입니다.");
	}
}
