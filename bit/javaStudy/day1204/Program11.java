import java.util.Scanner;

class Program11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r, h;
	double v;
	System.out.println("����� �ظ��� �������� �Է��Ͻÿ� : ");
	r = sc.nextInt();
	System.out.println("������� ���̸� �Է��Ͻÿ� : ");
	h = sc.nextInt();
	v = 3.141592 * r * r * h;

	System.out.println("������� ���Ǵ� " + v + " �Դϴ�.");
	}
}