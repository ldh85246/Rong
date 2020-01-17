import java.util.Scanner;

class CalcArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type;
		double area = 0, width, height, radius;
		System.out.println("*** 도형 면적 계산 프로그램 ***");
		System.out.print("도형의 종류를 입력하세요 ==> ");
		type = scan.next();

		switch(type) {
			case "R" : case "r" :
				System.out.print("사각형의 가로 길이 ==> ");
				width = scan.nextDouble();
				System.out.print("사각형의 세로 길이 ==> ");
				height = scan.nextDouble();
				area = width * height;
				break;

			case "T" : case "t" :
				System.out.print("삼각형의 가로 길이 ==> ");
				width = scan.nextDouble();
				System.out.print("삼각형의 세로 길이 ==> ");
				height = scan.nextDouble();
				area = width * height / 2;
				break;

			case "C" : case "c" :
				System.out.print("원의 반지름 ==> ");
				radius = scan.nextDouble();
				area = Math.PI * radius * radius;
				break;
		}
		System.out.printf("도형의 면적 : %.2f", area);
	}
}
