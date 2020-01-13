import java.util.Scanner;

class SaleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int base = 100;
		int cnt, total;
		System.out.println("*** 100원 상점 ***");
		System.out.print("구입수량을 입력하세요 ==> ");
		cnt = scan.nextInt();

		total = base * cnt;
		if (cnt >= 10) {
			total = (int) (total * 0.9);
			/*
			int discount = total *= 0.1;
			total -= discount;
			*/
			System.out.println("10개 이상 구매하시어 10%할인 되었습니다.");
		}
		System.out.println("전체 금액은 " + total + "원 입니다.");
	}
}
