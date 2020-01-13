// 사용자한테 월을 입력받아 계절명을 출력하는 프로그램 생성
// << 실행 예 >>
// 월을 입력하세요 ==> 7
// 7월은 여름입니다.
// 봄 : 3, 4, 5
// 여름 : 6, 7, 8,
// 가을 : 9, 10, 11
// 겨울 : 12, 1, 2

import java.util.Scanner;

class FourSeason {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month, f;

		System.out.println("월을 입력하세요 == > ");
		month = scan.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month == 1 && month == 2 || month == 12) {
			System.out.println("겨울");
		} else {
		System.out.println("땡! 재입력");
		}
	}
}
