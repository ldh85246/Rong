/*
사용자한테 n을 입력받아 1 ~ n까지의 짝수의 합을 누적하여 출력하는 프로그램
	while 문을 이용하여 작성
*/

import java.util.Scanner;
class WhileTest04{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.print("n을 입력하세요 ==> ");
		n = scan.nextInt();

		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1에서 " + n + "까지의 짝수의 합은 : " + sum);
	}
}
