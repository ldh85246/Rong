package star;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �� ���� �Է��ϼ���: ");
		int lineNumber = scan.nextInt();
		for (int i = 1; i <= lineNumber; i++) {
			String stars = "";
			for (int j = i; j <= lineNumber - 1; j++) {
				stars += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scan.close();
	}
}