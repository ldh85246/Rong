import java.util.Scanner;

class LastDayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		int ld = 31;
		System.out.println("*** 마지막 날 확인 프로그램 ***");
		System.out.print("월을 입력하세요 ==> ");
		m = scan.nextInt();

		if (m < 1 || m > 12) {
			System.out.println("입력값이 잘못 되었습니다.");
			return;
		}
		if (m == 2) {
			ld = 28;
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11) {
			ld = 30;
		}
		System.out.println(m + "월은" + ld + "일까지 있습니다.");
	}
}
