// ��������� �� ���� �Է¹޾� �� ���� ��ȭ����� ���Ͽ� ����ϴ� pg

import java.util.Scanner;

class NotFoundHarmonicMeanException {	// ����� ���� ����
	public NotFoundException (String msg) {
		super(msg);
	}
}

class HarmonicMeanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("ù��° ���� �Է����ּ��� ==> ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է����ּ��� ==> ");
		b = sc.nextInt();

		int r = (a * b) * 2 / (a + b);
		System.out.println("�� ���� ��ȭ����� ���� " + r + "�Դϴ�.");
	}
}