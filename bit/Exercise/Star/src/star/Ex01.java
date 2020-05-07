package star;
//����� 1��

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �� ���� �Է��ϼ��� : ");
		int lineNumber = scan.nextInt();
		for (int i = 1; i <= lineNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
