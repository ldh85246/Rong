package Done;

import java.util.Scanner;

public class BOJ8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String ox;
		for (int i = 1; i <= t; i++) {
			ox = sc.next();
			int score = 0, cnt = 0;
			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) == 'O') {
					cnt++;
					score += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(score);
		}
		sc.close();
	}
}
