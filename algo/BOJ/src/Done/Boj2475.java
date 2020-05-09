package Done;

import java.util.Scanner;

public class BOJ2475 {
	public static void main(String[] args) {
		int[] n = new int[5];
		Scanner sc = new Scanner(System.in);
		n[0] = sc.nextInt();
		n[1] = sc.nextInt();
		n[2] = sc.nextInt();
		n[3] = sc.nextInt();
		n[4] = sc.nextInt();
		sc.close();
		
		int square = 0;
		for (int i = 0; i < n.length; i++) {
			square += n[i] * n[i];
		}		
		System.out.println(square % 10);
	}
}
