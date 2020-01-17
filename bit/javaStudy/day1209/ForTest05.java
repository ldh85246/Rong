/*
ex) for문을 이용하여 다음과 같이 동작하는 프로그램을 작성하세요.

<< 실행 예 >>
별을 몇개 출력할까요? ==> 5
*****
*/

import java.util.Scanner;

class ForTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String s = "";
		System.out.print("별을 몇개 출력할까요? ==> ");
		n = scan.nextInt();
		for (int i = 1;  i <= n; i++) {
			s += "*";
			System.out.print("*");
		} System.out.print(s);
	}
}
