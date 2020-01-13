import java.util.Scanner;

class StudentTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String []name = new String[5];
		int []score = new int[5];
		int tot = 0;
		int avg = 0;

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
		System.out.println("전체총점 : " + tot);
		System.out.println("전체평균 : " + avg);
	}
}
