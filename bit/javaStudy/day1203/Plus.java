import java.util.Scanner;

class Plus {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("숫자 입력 : ");
	int number1;
	number1 = sc.nextInt();

	System.out.println("더할 숫자 입력 : ");
	int number2;
	number2 = sc.nextInt();	

	System.out.println("두 숫자의 합은 : " + (number1 + number2) + " 입니다.");
	}
}