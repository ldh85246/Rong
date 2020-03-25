package ing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt(); // vacation
		int a = sc.nextInt(); // kor
		int b = sc.nextInt(); // math
		int c = sc.nextInt(); // korDay
		int d = sc.nextInt(); // mathDay
		sc.close();

		if (a % c == 0) {
			a = a / c;
		} else {
			a = a / c + 1;
		}

		if (b % d == 0) {
			b = b / d;
		} else {
			b = b / d + 1;
		}

		if (a > b) {
			System.out.println(l - a);
		} else {
			System.out.println(l - b);
		}
	}
}
