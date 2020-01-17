/*
사용자한테 월을 입력받아 마지막 날을 출력하는 프로그램
입력한 월이 1 ~ 12 사이의 값이 아니라면 제대로 된 값을 입력받을 때까지 반복실행
*/

import java.util.Scanner;

class WhileTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;

		while (true) {
			System.out.print("월을 입력하세요 ==> ");
			month = scan.nextInt();

			if (month >= 1 && month <= 12) {
				break;
			}
		}
		int []lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		System.out.print(month + "월은 " + lastDay[month - 1] + "일까지 있습니다.");
	}
}
