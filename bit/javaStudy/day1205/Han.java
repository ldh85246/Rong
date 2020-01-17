// 연습) 사용자한테 0~9 사이의 정수를 입력받아 한글표기식 출력하는 프로그램 생성
// << 실행 예 >>
// 0~9 사이의 수를 입력하세요 ==> 7
// 칠!
// if (a==9)	a가 9하고 같은가요?

import java.util.Scanner;

class Han {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~9 사이의 수를 입력하세요 ==> ");
		int a = scan.nextInt();

		if (a == 9) {
			System.out.println("구!");
		} else if (a == 8){
			System.out.println("팔!");
		} else if (a == 7){
			System.out.println("칠!");
		} else if (a == 6){
			System.out.println("육!");
		} else if (a == 5){
			System.out.println("오!");
		} else if (a == 4){
			System.out.println("사!");
		} else if (a == 3){
			System.out.println("삼!");
		} else if (a == 2){
			System.out.println("이!");
		} else if (a == 1){
			System.out.println("일!");
		} else if (a == 0){
			System.out.println("영!");
		} else
			System.out.println("잘못된 입력입니다!");
	}
}
