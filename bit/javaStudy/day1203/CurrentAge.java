import java.util.Scanner;
import java.util.Date;

class CurrentAge {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("출생 연도를 입력하세요.");
	int birthYear;
		birthYear = sc.nextInt();

	Date today = new Date();
	int thisYear = today.getYear() + 1900;
	
	System.out.println("당신의 나이는 " + (thisYear - birthYear) + "살 입니다.");
	}
}