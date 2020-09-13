package Done;

import java.util.Scanner;

public class BOJ2920 {
	public static void main(String[] args) {
		String a = "1 2 3 4 5 6 7 8";
		String d = "8 7 6 5 4 3 2 1";
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		if (n.equals(a)) {
			System.out.println("ascending");
		} else if (n.equals(d)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		sc.close();
	}
}
