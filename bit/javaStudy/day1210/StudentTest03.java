// 최고점수와 최고점수를 받은 학생의 이름을 출력하도록 기능을 추가하세요.

import java.util.Scanner;

class StudentTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String []name = new String[5];
		int []score = new int[5];
		int tot = 0;
		int avg = 0;
		int max = score[0];
		int maxIndex = 0;
/*
		
*/
		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 학생의 이름 : ");
			name[i] = scan.next();
			System.out.print((i + 1) + "번째 학생의 점수 : ");
			score[i] = scan.nextInt();
			tot = tot + score[i];
		}

		avg = tot / score.length;
		System.out.println();
		System.out.println("*** 학생별 점수 ***");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + score[i]);
		}

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				maxIndex = i;
			}
		}

		System.out.println("최고점수 : " + max);
		System.out.println("가장 높은 점수를 받은 학생은 : " + name[maxIndex]);
	}
}
