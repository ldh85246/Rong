import java.util.Scanner;
import java.util.Random;

class GameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rdm = new Random();

		int user, com;
		String userStr = "", comStr = "";

		com = rdm.nextInt(3);

		System.out.println("*** 가위, 바위, 보 게임 ***");
		System.out.print("가위[0], 바위[1], 보[2] 중에 선택하세요 ==> ");
		user = scan.nextInt();

		if (user < 0 || user > 2) {
			System.out.println("입력값을 확인하세요!");
			return;
		}

		switch(user) {
			case 0 : userStr = "가위"; break;
			case 1 : userStr = "바위"; break;
			case 2 : userStr = "보"; break;
		} System.out.println("당신은 " + userStr + "를 냈습니다.");

		switch(com) {
			case 0 : comStr = "가위"; break;
			case 1 : comStr = "바위"; break;
			case 2 : comStr = "보"; break;
		} System.out.println("컴퓨터는 " + comStr + "를 냈습니다.");
		/*
		컴퓨터가 이겼는지, 사용자가 이겼는지, 비겼는지 판단하여
		게임결과를 출력하도록 기능을 추가해보세요.
		*/

		if (user == com) {
			System.out.println("비겼습니다=_=");
		} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("이겼습니다*^^*");
		} else {
			System.out.println("졌습니다ㅠㅠ");
		}
	}
}