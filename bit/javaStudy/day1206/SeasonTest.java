// 사용자한테 월을 입력받아 계절을 확인하는 프로그램 생성

import java.util.Scanner;

class SeasonTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		System.out.println("*** 계절명 확인 프로그램 ***");
		System.out.print("월을 입력 ===> ");		
		month = scan.nextInt();

		String r = "겨울";

		if (month < 1 || month > 12) {
		System.out.println("잘못 입력하셨습니다.");
		return;
		}

		if (month >= 3 && month <= 5) {
			r = "봄";
		} else if (month >= 6 && month <= 8) {
			r = "여름";
		} else if (month >= 9 && month <= 11) {
			r = "가을";
		}

		System.out.println(month + "월은 " + r + "입니다.");
	}
}
