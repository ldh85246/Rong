/*
사용자한테 n을 입력받아 1에서 n까지의 3의 배수를 모두 출력하시오.
*/

import java.util.Scanner;

class ForTest07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요 ==> ");
		n = scan.nextInt();

		for (int i = 3; i <= n; i += 3) {
			System.out.println(i);
		}
	}
}
