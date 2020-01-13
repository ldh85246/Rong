import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []score = new int[10];
		int tot = 0;
		double avg;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 학생의 점수를 입력해주세요 : ");
			score[i] = scan.nextInt();
			tot = tot + score[i];
		}
		avg = tot / score.length;
		System.out.println("전체합계 : " + tot);
		System.out.println("전체평균 : " + avg);
	}
}
