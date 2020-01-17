/*
사용자한테 생월, 생일을 입력받아 별자리를 구하여 출력하는 프로그램을 만들어 봅니다.
	<< 실행 예 >>
	이름은 무엇인가요? 홍길동
	몇 월에 태어났나요? 3
	몇 일에 태어났나요? 15
	홍길동님의 별자리는 ___자리입니다.

	<< 처리조건 >>
	물병자리	01/20 ~ 02/18
	물고기자리	02/19 ~ 03/20
	양자리		03/21 ~ 04/19
	황소자리	04/20 ~ 05/20
	쌍둥이자리	05/21 ~ 06/21
	게자리		06/22 ~ 07/22
	사자자리	07/23 ~ 08/22
	처녀자리	08/23 ~ 09/23
	천칭자리	09/24 ~ 10/22
	전갈자리	10/23 ~ 11/22
	사수자리	11/23 ~ 12/24
	염소자리	12/25 ~ 01/19
*/

import java.util.Scanner;

class StarTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int m, d;
		String star = "";

		System.out.print("이름은 무엇인가요? ");
		String name = scan.next();
		System.out.print("몇 월에 태어났나요? ");
		m = scan.nextInt();

		if (m > 12 || m < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		int ld = 31;

		switch(m) {
			case 2 : ld = 28; break;
			case 4 : case 6 : case 9 : case 11: ld = 30; break;
		} System.out.print("몇 일에 태어났나요? ");
		d = scan.nextInt();
		
		if (d < 1 || d > ld) {
			System.out.println(m + "월은 " + ld + "까지 있습니다.");
			return;
		}

		switch (m) {
			case 1 : if (d <= 19) {r = "물병자리";} else r = "염소자리"; break;
			case 2 : if (d <= 18) {r = "물병자리";} else r = "물고기자리"; break;
			case 3 : if (d <= 20) {r = "물고기자리";} else r = "양자리"; break;
			case 4 : if (d <= 19) {r = "양자리";} else r = "황소자리"; break;
			case 5 : if (d <= 20) {r = "황소자리";} else r = "쌍둥이자리"; break;
			case 6 : if (d <= 21) {r = "쌍둥이자리";} else r = "게자리"; break;
			case 7 : if (d <= 22) {r = "게자리";} else r = "사자자리"; break;
			case 8 : if (d <= 22) {r = "사자자리";} else r = "처녀자리"; break;
			case 9 : if (d <= 23) {r = "처녀자리";} else r = "천칭자리"; break;
			case 10 : if (d <= 22) {r = "천칭자리";} else r = "전갈자리"; break;
			case 11 : if (d <= 22) {r = "전갈자리";} else r = "사수자리"; break;
			case 12 : if (d <= 24) {r = "사수자리";} else r = "염소자리"; break;
		}
	} System.out.println(name + "님의 별자리는 " + r + "입니다.");
}