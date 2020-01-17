/*
ex) 다음과 같이 동작하는 프로그램을 작성하시오

<< 실행 예 >>
줄수를 입력하세요 ==> 3
칸수를 입력하세요 ==> 4
****
****
****
*/

import java.util.Scanner;

class PrintStar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("줄수를 입력하세요 ==> ");
		int a = scan.nextInt();
		System.out.print("칸수를 입력하세요 ==> ");
		int b = scan.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}
