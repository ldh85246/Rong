/*
사용자로부터 이메일을 입력받아 아이디만 추출하여 출력하는 프로그램을 작성

tiger@nate.com //@ 이전까지
*/

import java.util.Scanner;

class CheckEmailTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("e-mail을 입력해주세요.");
		String e = sc.next();

//		int idx = e.indexOf("@");
		String id = e.substring(0, /*idx*/e.indexOf("@"));
		System.out.println("ID는" + id + "입니다.");
	}
}
