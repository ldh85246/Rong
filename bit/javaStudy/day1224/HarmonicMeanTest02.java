// ��������� �� ���� �Է¹޾� �� ���� ��ȭ����� ���Ͽ� ����ϴ� pg

import java.util.Scanner;

class NotFoundHarmonicMeanException extends Exception {	// ����� ���� ����
	public NotFoundHarmonicMeanException (String msg) {
		super(msg);
	}
}

class HarmonicMeanTest02 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("ù��° ���� �Է����ּ��� ==> ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է����ּ��� ==> ");
		b = sc.nextInt();

		if (a == -b) {
			throw new NotFoundHarmonicMeanException("�� ���� ��ȭ����� �����ϴ�.");
		}

		int r = (a * b) * 2 / (a + b);
		System.out.println("�� ���� ��ȭ����� ���� " + r + "�Դϴ�.");
		} catch(NotFoundHarmonicMeanException e) {
			System.out.println(e.getMessage());
		}
	}
}