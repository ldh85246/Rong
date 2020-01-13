/*
사용자로부터 연도를 입력받아 그 해가 윤년인지 판별하는 프로그램을 작성
*/

import java.util.Scanner;
import java.util.GregorianCalendar;

class GregorianCalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String year = "";
		int i = 1;
		while (i == 1) {
			System.out.print("연도를 입력하세요 ==> ");
			year = sc.next();
			if (!year.matches("[0-9]{4}")) {
				System.out.println("올바른 입력을 진행해주세요.");
				continue;
			} else {
				i++;
			}
		}

		/*
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
		*/
		
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(Integer.parseInt(year))) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
	}
}
