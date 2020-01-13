/* ex) 사용자한테 월을 입력받아 마지막 날을 출력하는 프로그램 작성
<< 실행 예 >>
월을 입력하세요 ==> 7
7월은 31일까지 있어요!
<< 처리조건 >>
31 : 1, 3, 5, 7, 8, 10, 12
30 : 4, 6, 9, 11
28 : 2
*/ 

import java.util.Scanner;

class LastDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 ==> ");
		int m = scan.nextInt();
		String a = "";

		if (m < 1 || m > 12 ) {
			System.out.println("잘못 입력");
			return;
		} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			a = "31일";
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			a = "30일";
		} else {
			System.out.println("28일");
		} System.out.println(m + "월의 마지막 날은 " + a + "까지 있습니다.");
	}
}
