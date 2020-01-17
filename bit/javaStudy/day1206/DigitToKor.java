import java.util.Scanner;

class DigitToKor {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("0~9 사이의 정수 ==> ");
		n = sc.nextInt();

		if(n < 0 || n > 9) {
			System.out.println("입력 값을 확인하세요!");
			return;
		}
		String r = "";

		switch (n) {
		case 0 : r = "영"; break;
		case 1 : r = "일"; break;
		case 2 : r = "이"; break;
		case 3 : r = "삼"; break;
		case 4 : r = "사"; break;
		case 5 : r = "오"; break;
		case 6 : r = "육"; break;
		case 7 : r = "칠"; break;
		case 8 : r = "팔"; break;
		case 9 : r = "구"; break;
		}
		System.out.println(r);
	}
}
