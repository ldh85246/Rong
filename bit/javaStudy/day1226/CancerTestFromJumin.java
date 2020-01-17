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

class CancerTestFromJumin {
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

		String gender = "남자";
		if (currentYear % 2 == 0) {
			gender = "여자";
		}

		int birthYear = currentYear - age;

		if (birthYear % 2 == 0 && age >= 40 && age < 50 && gender == "남자") {
			System.out.println("40세 이상 50세 이하 남성으로,\n무료 암검진 항목은 위암, 간암입니다.");
		} else if (birthYear % 2 == 0 && age >= 40 && age < 50 && gender == "남자") {
			System.out.println("40세 이상 50세 이하 여성으로,\n무료 암검진 항목은 위암, 간암, 유방암, 자궁암입니다.");
		}
	}
}
