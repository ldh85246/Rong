package star;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �� ���� �Է����ּ���: ");
		int lineNumber = scan.nextInt();
		for (int i = 1; i <= lineNumber; i++) {
			String stars = "";
			for (int j = i; j <= lineNumber - 1; j++) {
				stars += " ";
			}
			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scan.close();
	}
}
