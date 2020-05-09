package Done;

import java.util.Scanner;

public class BOJ2845 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		int r = l * p;
		int[] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			int n = arr[i] - r;
			System.out.println(n + " ");
		}
	}
}
