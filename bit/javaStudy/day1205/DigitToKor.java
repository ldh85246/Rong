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

		if (n == 0)
			r = "영";
		else if (n == 1)
			r = "일";
		else if (n == 2)
			r = "이";
		else if (n == 3)
			r = "삼";
		else if (n == 4)
			r = "사";
		else if (n == 5)
			r = "오";
		else if (n == 6)
			r = "육";
		else if (n == 7)
			r = "칠";
		else if (n == 8)
			r = "팔";
		else if (n == 9)
			r = "구";
		System.out.println(r);
	}
}
