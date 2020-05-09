package Done;

import java.util.Scanner;

public class BOJ2914 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = sc.nextInt();
		sc.close();
		System.out.println(a * (i - 1) + 1);
	}
}
