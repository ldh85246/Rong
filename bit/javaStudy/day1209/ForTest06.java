/*
사용자한테 n을 입력받아 1에서 n까지의 3의 배수를 모두 출력하시오.
*/

import java.util.Scanner;

class ForTest06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요 ==> ");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
