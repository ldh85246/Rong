/*
����ڷκ��� ��ȭ��ȣ�� �Է¹޾� �ùٸ� ��ȭ��ȣ �������� �Ǻ��ϴ� ���α׷��� �ۼ�

010-0000-0000

1) ������ 2���� �����Ͽ� 13�ڸ� ����
2) ù��° ������ ������ 3�ڸ�
3) ù��° �����°� �ι�° ������ ���̿��� 4�ڸ�
4) �ι�° ������ �ڿ��� 4�ڸ�
*/

import java.util.Scanner;

class CheckPhoneNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** ��ȭ��ȣ �Ǻ� ���α׷� ***");
		System.out.print("��ȭ��ȣ�� �Է����ּ��� ==> ");
		String n = sc.next();

		int n1 = n.indexOf("-");
		int n2 = n.lastIndexOf("-");
		if (n1 != 3 || n2 != 8 || n.length() != 13) {
			System.out.println("������ȣ�� �ٽ� Ȯ�� ���ּ���.");
			return;
		}

		for (int i = 0; i < n.length(); i++) {
			if (i != 3 && i != 8) {
				char ch = n.charAt(i);
				if (ch < '0' || ch > '9') {
					System.out.println("�ùٸ� ��ȭ��ȣ ������ �ƴմϴ�.");
					return;
				}
			}
		}
		System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�.");
	}
}