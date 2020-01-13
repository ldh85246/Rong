// 연습) 사용자한테 임의의 정수 n을 입력받아 그 수가 0을 포함한 양수이면
//			그 수의 100을 더한 값을 출력하고 "작업종료"를 출력합니다.
//			그렇지 않다면 그 수의 제곱을 출력하고 "작업종료"를 출력합니다.

// << 실행 예 >>
// 정수를 입력하세요 ==> 5
// 105
// 작업종료

// 정수를 입력하세요 ==> -5
// 25
// 작업종료

import java.util.Scanner;

class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scan.nextInt();

		if (n >= 0)
			System.out.print((n + 100) + "\n작업종료");
		else
			System.out.print((n * n) + "\n작업종료");
	}
}
