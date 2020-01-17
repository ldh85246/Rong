import java.util.Scanner;

class Hw03sec{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int com;
		System.out.println("컴퓨터 개론 : ");
			com = scan.nextInt();
	int cPro;
		System.out.println("C언어 프로그래밍 : ");
			cPro = scan.nextInt();
	int eng;
		System.out.println("영어 : ");
			eng = scan.nextInt();
	int math;
		System.out.println("일반수학 : ");
			math = scan.nextInt();

	int i = (com + cPro + eng + math) / 4;

	System.out.println("평균점수 : " + i);
	}
}