package star;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �� ���� �Է��ϼ��� : ");
		int lineNumber = scan.nextInt();
		for (int i = 1; i <= 2 * lineNumber - 1; i++) {
			String stars = "";
			if (i <= lineNumber - 1) {
				for (int j = i; j <= lineNumber - 1; j++) {
					stars += " ";
				}
				for (int j = 1; j <= 2 * i - 1; j++)
					stars += "*";
			} else {
				// lowerI�� 1 2 3 4 5... lineNumber�� �ȴ�.
				int lowerI = i - lineNumber + 1;
				// ���� ���� lowerI�� �������� �ٲ��ֱ� ����
				// lineNumber - lowerI + 1�� ���ش�.
				// reversedI�� lineNumber lineNumber - 1... 1�� �ȴ�.
				int reversedI = lineNumber - lowerI + 1;
				for (int j = reversedI; j <= lineNumber - 1; j++) {
					stars += " ";
				}
				for (int j = 1; j <= 2 * reversedI - 1; j++) {
					stars += "*";
				}
			}
			System.out.println(stars);
		}
		scan.close();
	}
}
