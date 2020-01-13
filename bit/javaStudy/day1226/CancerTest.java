/*
사용자로부터 주민등록번호를 입력받아 무료 암검진 대상자인지 판별하는 프로그램을 작성

<처리조건>
- 무료 암검진 대상자는 40세이상
	올해가 짝수연도이면 짝수해에 태어난 사람
	올해가 짝수연도이면 홀수해에 태어난 사람

- 나이가 40살 이상 남자이면 무료 검진항목이 위암, 간암
- 나이가 40살 이상 여자이면 무료 검진항목이 위암, 간암, 유방암, 자궁암
- 나이가 50살 이상 남자이면 무료 검진항목이 위암, 간암, 대장암
- 나이가 50살 이상 여자이면 무료 검진항목이 위암, 간암, 대장암, 유방암, 자궁암
*/

import java.util.Scanner;
import java.util.Date;

class MyUtil {
	public static int getYear(String jm) {
		int year = Integer.parseInt(jm.substring(0,2));

		year += 1900;

		int flag = Integer.parseInt(jm.substring(7,8));
		if (flag == 3 || flag == 4 || flag == 7 || flag == 8) {
			flag = year + 100;
		}
		return year;
	}

	public static int getAge(String jm) {
		int year = getYear(jm);
		int currentYear = (new Date()).getYear() + 1900;
		int age = currentYear - year;
		return age;
	}

	public static String getGender(String jm) {
		String re = "남자";
		int f = Integer.parseInt(jm.substring(7, 8));
		
		if (f % 2 == 0) {
			re = "여자";
		}
		return re;
	}
}

class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 무료 암검진 대상자 판별 프로그램 ***");		
		System.out.print("주민등록번호를 입력 ==> ");
		String jm = sc.next();

		int birthYear = MyUtil.getYear(jm);
		int age = MyUtil.getAge(jm);
		String gender = MyUtil.getGender(jm);
		int currentYear = (new Date()).getYear() + 1900;

		String r = "위암, 간암";

//		2019-1969
//		if (age < 40 || currentYear % 2 != birthYear % 2) {
		if (age < 40 || age % 2 != 0) {	// 올해연도 - 출생연도 = 나이
			System.out.println("무료 암검진 대상자가 아닙니다.");
			return;
		}

		if (age >= 50) {
			r = r + ", 대장암";
		}

		if (gender.equals("여자")) {
			r = r + ", 유방암, 자궁암";

			System.out.println("올해 무료 암검진 대상자 입니다.");
			System.out.println("검진항목은 " + r + "입니다.");
		}
	}
}
