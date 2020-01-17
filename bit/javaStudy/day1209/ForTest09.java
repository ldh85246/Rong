/*
사용자한테 임의의 수 n을 입력받아 그 수가 소수인지 판별하는 프로그램 작성

<< 실행 예 >>
n 을 입력하세요 ==> 7
7은 소수입니다.

<< 소수 >>
약수의 수가 2개인 수를 말합니다.
*/

import java.util.Scanner;

class ForTest09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		System.out.print("n을 입력하세요 ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt += 1;
			}
		}
		if (cnt == 2) {
			System.out.print(n + "은(는) 소수입니다.");
		} else {
			System.out.print(n + "은(는) 소수가 아닙니다.");
		}
	}
}
