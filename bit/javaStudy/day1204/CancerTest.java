// << 연습 >>
// 어떤 사람의 출생 연도를 입력받아
// 그 사람이 무료 암검진 대상자인지 판별하는 프로그램을 만드세요.
// ***처리조건***
// 나이가 40살 이상이고 출생 연도가 홀수 연도인 사람이
// 무료 암검진 대상자입니다.

import java.util.Scanner;
import java.util.Date;

class CcTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date thisYear = new Date();
		int year;
		System.out.println("출생 연도를 입력하세요.");
		year = scan.nextInt();

		int age = thisYear.getYear()+1900;
		int tp = thisYear - year;
		if (tp >= 40 && tp % 2 = 0);
			System.out.println("무료 암검진 대상자입니다.");
		else
			System.out.println("무료 암검진가 아닙니다.");
	}
}
