import java.util.Scanner;

class Hw_1_3 {
	public static void main(String[] args) {
		int g, m;
		m = 100;
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개를 구입하셨습니까? ");
		g = scan.nextInt();

		if (g < 10) {
			m *= g; // m * g = m
		} else {
			m *= g;
			m -= m * 0.1; // m * 0.1 - m = m
		} System.out.print("구매 가격은 " + m + "입니다.");
	}
}
