// 출생 연도를 입력받아
// 나이를 계산하여
// 무료 암검진 대상자인지 판별하도록 코드를 수정

import java.util.Scanner;
import java.util.Date;

class CancerTest2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("***무료 암검진 대상자 확인***");
	System.out.println("나이를 입력하세요");

	int age;
	age = sc.nextInt();

	if (age >= 40 && age <= 150)
		System.out.println("무료암검진 대상자입니다.");
	else if (age < 40 && age >= 0)
		System.out.println("무료암검진 대상자가 아닙니다.");
	else
		System.out.println("잘못된 입력입니다.");

	Date today = new Date();
	int thisYear = today.getYear() + 1900;
	}
}