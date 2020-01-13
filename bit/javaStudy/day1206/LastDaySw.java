/*
사용자한테 월을 입력받아 마지막 날을 출력하는 프로그램 생성
	단, switch case 문을 사용합니다.
<< 실행 예 >>
월을 입력하세요 ==> 4
4월은 30일 까지 있습니다.
<< 처리조건 >>
31 : 1, 3, 5, 7, 8, 10, 12
30 : 4, 6, 9, 11
28 : 2
*/
import java.util.Scanner;

class LastDaySw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		String ld = "";
		System.out.println("*** 마지막 날 확인 프로그램 ***");
		System.out.print("월을 입력하세요 ==> ");
		m = scan.nextInt();

		if (m < 1 || m > 12) {
		System.out.println("입력값을 확인하세요!");
		return;
		}

		switch (m) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			ld = "31일"; break;

		case 4 : case 6 : case 9 : case 11 :
			ld = "30일"; break;

		default : System.out.println("2월은 28일까지 있습니다."); return;

		} System.out.println(m + "월은 " + ld + "까지 있습니다.");
	}
}
