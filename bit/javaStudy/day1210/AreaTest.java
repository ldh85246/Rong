/*
사각형 면적 = 높이 * 밑변
삼각형 면적 = 높이 * 밑변
원 면적 = PI * 반지름 * 반지름
*/

import java.util.Scanner;

class AreaTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, b, rad;
		double r = 0;
		String a;

		System.out.print("문자 입력 ==> ");
		a = scan.next();

		if (!a.equals("R") && !a.equals("T") && !a.equals("C") && a.equals("r") && a.equals("t") && a.equals("c")) {
			System.out.println("올바른 문자를 확인하세요!");
			return;
		}

		if (a.equals("R") || a.equals("r")) {
			System.out.print("높이 입력 ==> ");
			h = scan.nextInt();
			System.out.print("밑변 입력 ==> ");
			b = scan.nextInt();
			r = h * b;
		} else if (a.equals("T") || a.equals("t")) {
			System.out.print("높이 입력 ==> ");
			h = scan.nextInt();
			System.out.print("밑변 입력 ==> ");
			b = scan.nextInt();
			r = h * b;
		} else if ((a.equals("C") || a.equals("c"))) {
			System.out.print("반지름 입력 ==> ");
			rad = scan.nextInt();
			r = Math.PI * (double) rad * rad;
		}
		System.out.printf("결과 : %.2f", r);
	}
}
