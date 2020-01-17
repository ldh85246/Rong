/*
ex) 사용자한테 n을 입력받아 1 ~ n까지의 짝수의 합을 누적하여 출력하는 프로그램
		do ~ while 문을 이용한다.
*/

import java.util.Scanner;

class DoWhileTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력하세요 ==> ");
		int n = scan.nextInt();

		int i = 1;
		int sum = 0;
		do {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		} while (i <= n);
		System.out.println("1부터 " + n + "까지의 짝수의 합은 : " + sum);
	}
}
