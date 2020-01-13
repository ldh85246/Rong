import java.util.Scanner;

class CalcTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String op;
		int a, b;
		double r = 0;
		System.out.println("*** 간단한 계산기 ***");
		System.out.print("연산자를 입력(+, -, *, /) ==> ");
		op = scan.next();

		if (!op.equals("+") && !op.equals("-") && !op.equals("*") &&  !op.equals("/")) {
			System.out.println("올바른 연산자를 확인하세요!");
			return;
		}

		System.out.print("첫번째 수를 입력 ==> ");
		a = scan.nextInt();
		System.out.print("두번째 수를 입력 ==> ");
		b = scan.nextInt();

		if (op.equals("+")) {
			r = a + b;
		} else if (op.equals("-")) {
			r = a - b;
		} else if (op.equals("*")) {
			r = a * b;
		} else if (op.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌 수는 없어요!");
				return;
			}
			r = a / (double) b;
		}
		System.out.printf("결과 : %.2f", r);
	}
}
