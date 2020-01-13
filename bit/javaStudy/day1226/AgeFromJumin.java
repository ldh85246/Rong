/*
사용자로부터 주민등록번호를 입력받아 나이를 계산하여 출력
*/

import java.util.Scanner;
import java.util.Date;

class AgeFromJumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력");
		String jm = sc.next();
		int year = Integer.parseInt(jm.substring(0,2));

		year += 1900;

		int flag = Integer.parseInt(jm.substring(7,8));
		if (flag == 3 || flag == 4 || flag == 7 || flag == 8) {
			flag = year + 100;
		}

		int currentYear = (new Date()).getYear() + 1900;
		int age = currentYear - year;

		System.out.println("입력하신 주민등록번호의 나이는 " + age + "입니다.");
	}
}
