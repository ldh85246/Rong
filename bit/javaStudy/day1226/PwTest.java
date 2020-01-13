/*
사용자한테 암호와 암호확인을 입력받아 서로 일치하는지 판별하는 프로그램을 작성
또 암호는 6자이상 10자이하로 제한
조건을 만족하는지 판별하여 적당한 메시지를 출력
*/

import java.util.Scanner;

class PwTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pwt;
		while (pwt) {
			String pw, pw1;
			System.out.println("비밀번호 입력");
			pw = sc.next();

			if (pw.length() < 6) {
				System.out.println("비밀번호는 6자 이상으로 입력해주셔야 합니다.");
			} else if (pw.length() >= 10) {
				System.out.println("비밀번호는 10자 이하로 입력해주셔야 합니다.");
			}

			if (pw1.length() < 6) {
				System.out.println("비밀번호는 6자 이상으로 입력해주셔야 합니다.");
			} else if (pw1.length() >= 10) {
				System.out.println("비밀번호는 10자 이하로 입력해주셔야 합니다.");
			}

			if (pw == pw1) {
				System.out.println("적절한 비밀번호!");
			}
		}
	}
}
