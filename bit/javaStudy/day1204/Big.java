// ��������� �ΰ��� ������ �Է¹޾� �� �߿� ū ���� ã�� ����ϴ� ���α׷��� �ۼ�
// (Ŭ���� �̸�, ������ ���� �����Ӱ�)
// << ���� �� >>
// ù��° ���� �Է��ϼ��� ==> 7
// �ι�° ���� �Է��ϼ��� ==> 5
// ū ���� 7�Դϴ�.

import java.util.Scanner;

class Big{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		i = scan.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		j = scan.nextInt();

		if (i > j)
			System.out.printf("ū ���� %d�Դϴ�.", i);
		else
			System.out.printf("ū ���� %d�Դϴ�.", j);
	}
}