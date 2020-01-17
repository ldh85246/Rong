// 그 해가 홀수 연도이면 홀수 연도에 태어난 사람
// 그 해가 짝수 연도이면 짝수 연도에 태어난 사람
// 무료 암검진 대상자가 되도록 코드를 수정

import java.util.Scanner;
import java.util.Date;

class CcTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		int birthYear, age;
		String result;

		System.out.println("***무료 암검진 대상자 판별 프로그램***");
		System.out.print("출생연도를 입력 : ");
		birthYear = sc.nextInt();
		age = thisYear - birthYear;
		if (age >= 40 && birthYear % 2 != 0)
			result = "무료 암검진 대상자입니다.";
		if (age >= 40 && age % 2 == 0)
			result = "무료 암검진 대상자입니다.";
		else
			result = "무료 암검진 대상자가 아닙니다.";
		
		System.out.println(result);
	}
}
