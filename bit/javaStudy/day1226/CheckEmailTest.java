/*
����ڷκ��� �̸����� �Է¹޾� ���̵� �����Ͽ� ����ϴ� ���α׷��� �ۼ�

tiger@nate.com //@ ��������
*/

import java.util.Scanner;

class CheckEmailTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("e-mail�� �Է����ּ���.");
		String e = sc.next();

//		int idx = e.indexOf("@");
		String id = e.substring(0, /*idx*/e.indexOf("@"));
		System.out.println("ID��" + id + "�Դϴ�.");
	}
}