// ��������� �ҹ��ڷ� �� ���ڿ��� �Է¹޾� �빮�ڷ� �����ϴ� ���α׷�

import java.util.Scanner;

class ToUpper{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("*** �ҹ��ڸ� �빮�ڷ� ��ȯ ***");
		System.out.print("�ҹ��� �ܾ �Է��ϼ��� ===> ");
		// str = scan.next(); // ex) hello�� ��ٸ�..?
		str = scan.nextLine();

		for(int i = 0; i < str.length(); i = i + 1) {
			char ch1 = str.charAt(i);
			System.out.print((char)(ch1 - 32));
		}
	}
}