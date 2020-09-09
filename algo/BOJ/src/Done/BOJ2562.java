package Done;

import java.util.Scanner;

public class BOJ2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int max_loc = 0;
		for (int i = 1; i <= 9; i++) {
			int n = sc.nextInt();
			if (n > max) {
				max = n;
				max_loc = i;
			}
		}
		System.out.println(max);
		System.out.println(max_loc);
		sc.close();
	}
}
