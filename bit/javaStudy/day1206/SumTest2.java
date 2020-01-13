import java.util.Scanner;

class SumTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, n, sum = 0;

		System.out.print("어디까지 더할까요?");
		n = scan.nextInt();

		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("1에서 " + n + "까지의 합은 : " + sum);
	}
}
