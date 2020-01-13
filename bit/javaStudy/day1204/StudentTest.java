import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int com, c, eng, math;

	System.out.print("컴퓨터 개론 : ");
	com = scan.nextInt();

	System.out.print("C언어 프로그래밍 : ");
	c = scan.nextInt();

	System.out.print("영어 : ");
	eng = scan.nextInt();

	System.out.print("일반수학 : ");
	math = scan.nextInt();

	double avg = (com + c + eng + math) / 4.0;

	System.out.println("평균점수 : " + avg);
	}
}