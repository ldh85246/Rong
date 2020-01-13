import java.util.Scanner;

class FacTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, r = 1;

		System.out.println("*** 팩토리얼 출력 시스템 ***");
		System.out.print("n을 입력하세요 ==> ");
		n = scan.nextInt();

		for (int i = n; i >= 1; i--) {
			r = r * i;
			System.out.print(i);
			if(i != 1)
				System.out.print(" * ");
		} System.out.print(" = " + r);
	}
}
