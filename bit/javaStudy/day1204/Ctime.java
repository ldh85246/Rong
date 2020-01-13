import java.util.Scanner;

class Ctime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, m, s;
		System.out.println("초를 입력해주세요.");
		s = scan.nextInt();

		m = s / 60;
		h = m / 60;
		s = s % 60;
		m = m % 60;
		System.out.printf("입력하신 초를 시간으로 환산 시 %d시 %d분 %d초로 환산됩니다.", h, m, s);
	}
}
