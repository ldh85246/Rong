import java.util.Scanner;

class Hw03fir{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("원기둥 밑면의 반지름을 입력하시오 : ");
	int rad = scan.nextInt();

	System.out.println("원기둥의 높이를 입력하시오 : ");
	int height = scan.nextInt();

	double vol = rad * rad * 3.14 * height;
		System.out.println("원기둥의 부피는 " + vol + "입니다.");
	}
}