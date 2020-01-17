/*
사용자한테 암호와 암호확인을 입력받아 서로 일치하는지 판별하는 프로그램을 작성
또 암호는 6자이상 10자이하로 제한
조건을 만족하는지 판별하여 적당한 메시지를 출력
*/

import java.util.Scanner;

class PasswordCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pw, pwCheck;
		System.out.println("비밀번호 입력");
		pw = sc.next();
		System.out.println("비밀번호 재입력");
		pwCheck = sc.next();

		if (!pw.equals(pwCheck)) {
			System.out.println("비밀번호를 재확인해주세요.");
			return;
		}

		int n = pw.length();
		if (n >= 6 && n <= 10) {
			System.out.println("적절한 비밀번호!");
		} else {
			System.out.println("비밀번호를 재확인해주세요.");
		}
	}
}
