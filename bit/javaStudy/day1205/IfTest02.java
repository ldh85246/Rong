import java.util.Scanner;

class IfTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, max;

		System.out.print("ù��° �� �Է� : ");
		a = scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		b = scan.nextInt();
		System.out.print("����° �� �Է� : ");
		c = scan.nextInt();

		if (a > b)
			if (a > c)
				max = a;
			else
				max = c;
		else
			if (b > c)
				max = b;
			else
				max = c;

		System.out.println("ū ���� " + max + "�Դϴ�.");
	}
}