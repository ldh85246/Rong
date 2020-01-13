/*
ex) 다음과 같이 동작하는 프로그램을 생성

<< 실행 예 >>
줄 수를 입력하세요 ==> 5
*
**
***
****
*****
*/

import java.util.Scanner;

class PrintStar02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("줄 수를 입력하세요 ==> ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
