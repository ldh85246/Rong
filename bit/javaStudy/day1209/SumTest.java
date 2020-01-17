/*
사용자로부터 n을 입력받아 1에서 n까지의 짝수의합, 홀수의 합, 짝수의 개수, 
	홀수의 개수를 각각 구하여 출력하세요.
*/

import java.util.Scanner;

class SumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, sumEven = 0, sumOdd = 0, cntEven = 0,cntOdd = 0;

		System.out.print("n을 입력하세요 ==> ");
		n = scan.nextInt();
		// i : 1, 2, 3, 4, 5...n

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven += i;
				cntEven ++;
				// cntEven += 1;
				// cntEven = cntEven + 1;
			} else {
				sumOdd += i;
				cntOdd++;
			}
		}
		System.out.println("짝수의 합 : " + sumEven);
		System.out.println("홀수의 합 : " + sumOdd);
		System.out.println("짝수의 개수 : " + cntEven);
		System.out.println("홀수의 개수 : " + cntOdd);

	}
}
