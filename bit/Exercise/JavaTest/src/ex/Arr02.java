package ex;

import java.util.Scanner;

public class Arr02 {

	public static void main(String[] args) {

		// 배열을 이용한 학사관리
		String[] name = { "박찬호", "이승엽", "박병호", "이병규", "류현진" };
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
		score[3] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
		score[4] = sc.nextInt();

		System.out.printf("%s 선수의 점수 : %.2f\n", name[0], (double) score[0]);
		System.out.printf("%s 선수의 점수 : %.2f\n", name[1], (double) score[1]);
		System.out.printf("%s 선수의 점수 : %.2f\n", name[2], (double) score[2]);
		System.out.printf("%s 선수의 점수 : %.2f\n", name[3], (double) score[3]);
		System.out.printf("%s 선수의 점수 : %.2f\n", name[4], (double) score[4]);

		double avg = (double) (score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.println("--------------------");
		System.out.printf("평점 : %.2f", avg);
		sc.close();
	}
}
