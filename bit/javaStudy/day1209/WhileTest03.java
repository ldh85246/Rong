/*
다음과 같이 동작하는 프로그램을 while문을 이용하여 작성하세요.

<< 실행 예 >>
줄 수를 입력하세요 ==> 3
칸 수를 입력하세요 ==> 4
****
****
****
*/

import java.util.Scanner;

class WhileTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows, cols;
		System.out.print("줄 수를 입력하세요 ==> ");
		rows = scan.nextInt();
		System.out.print("칸 수를 입력하세요 ==> ");
		cols = scan.nextInt();

		int i = 1;
		while (i <= rows) {
			int j = 1;
			while (j <= cols) {
				System.out.print("*");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}
