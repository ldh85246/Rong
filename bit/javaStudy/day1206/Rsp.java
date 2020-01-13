/*
컴퓨터와 사용자 간에 가위, 바위, 보 게임을 위한 프로그램
사용자한테 0, 1, 2를 입력을 받아 "가위","바위","보"를 출력하세요.
<< 실행 예 >>
가위[0], 바위[1], 보[2] 중에 선택하세요 ==> 1
당신은 바위를 내셨습니다.
*/

import java.util.Scanner;

class Rsp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*** 컴퓨터와 가위! 바위! 보! ***");
		System.out.print("가위[0], 바위[1], 보[2] 중에 선택하세요 ==> ");
		int n = scan.nextInt();
		String r = "";

		switch (n) {
		case 0 : System.out.println(r = "가위"); break;
		case 1 : System.out.println(r = "바위"); break;
		case 2 : System.out.println(r = "보"); break;
		default : System.out.print("가위[0], 바위[1], 보[2] 중에서만 입력해주세요!"); return;
		}
		System.out.println("당신은 " + r + "를 내셨습니다.");
	}
}
