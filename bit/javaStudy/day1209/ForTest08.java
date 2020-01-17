/*
ex) 사용자한테 n을 입력받아 n의 약수를 모두 출력하는 프로그램을 생성

<< 실행 예 >>
n을 입력하시오 ==> 8
1 2 4 8
*/

import java.util.Scanner;

class ForTest08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("n을 입력하시오 ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.print("작업종료");
	}
}
