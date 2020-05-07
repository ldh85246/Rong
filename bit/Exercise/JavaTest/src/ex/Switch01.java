package ex;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		System.out.println("점수 입력");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch (score) {
		case 100:
			System.out.printf("점수는 %d", score);
			break;

		case 90:
			System.out.printf("점수는 %d\n", score);
			break;
		
		case 80:
			System.out.printf("점수는 %d\n", score);
			break;
		
		case 70:
			System.out.printf("점수는 %d\n", score);
			break;
			
		case 60:
			System.out.printf("점수는 %d\n", score);
			break;
			
		default:
			System.out.println("점수는?");
			break;
		}
		sc.close();
	}
}
