import java.util.Scanner;

class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, i;

		System.out.print("°ª ÀÔ·Â ==> ");
		int n = scan.nextInt();

		for (i = 1; i <= n; i++) {
		c = a + b;
		System.out.println(a + " ");
		b = a;
		b = c;
		a++;
		}
	}
}