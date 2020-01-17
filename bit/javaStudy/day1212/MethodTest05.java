// 두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 출력하는 메소드를 정의

import java.util.Scanner;

class MethodTest05 {
	public static void max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		System.out.println("두 숫자 중 큰 수는 : " + r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 ==> ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 ==> ");
		int b = sc.nextInt();
		max(a, b);
	}
}
