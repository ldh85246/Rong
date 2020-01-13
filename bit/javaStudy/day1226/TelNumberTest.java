/*
사용자로부터 전화번호를 입력받아 올바른 전화번호 형식인지 판별하는 프로그램을 작성

010-0000-0000

1) 하이픈 2개를 포함하여 13자리 문자
2) 첫번째 하이픈 전에는 3자리
3) 첫번째 하이픈과 두번째 하이픈 사이에는 4자리
4) 두번째 하이픈 뒤에는 4자리
*/

import java.util.Scanner;

class TelNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 전화번호 판별 프로그램 ***");
		System.out.print("전화번호를 입력해주세요 ==> ");
		String n = sc.next();

		if (n.length() > 13) {
			System.out.println("잘못된 전화번호 형식입니다.");
		} else if (!n.substring(3, 4).equals("-") || !n.substring(8, 9).equals("-")) {
			System.out.println("하이픈을 확인해주세요.");
		} else {
			System.out.println("올바른 전화번호 형식입니다.");
		}
	}
}
