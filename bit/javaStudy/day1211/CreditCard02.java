import java.util.Scanner;

class CreditCard02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// double []cards;
		// cards = new double[12];
		double []cards = new double[12];
		// cards[0], cards[1], ... cards[11];

		double total = 0; // 누적을 측정하기 위해 0부터
		for (int i = 0; i < cards.length/* 12도 가능(12달 이므로) */; i++) {
			System.out.print((i + 1) + "월달 카드 사용료를 입력 ==> ");
			cards[i] = scan.nextDouble();
			total = total + cards[i];
		}

		double avg = total / cards.length; // 12

		double max = cards[0];
		double min = cards[0];

		for (int i = 1; i < cards.length; i++) {
			if (cards[i] > max) {
				max = cards[i];
			}
			if (cards[i] < min) {
				min = cards[i];
			}
		}

		/*
		max : 2, min : 2
		[2][2][1][3][7]...[100]
		    1
		큰 것을 구하는 논리와 작은 것을 구하는 논리는 별개로 생각해야함
		각각 별개의 if로 구해야 함
		*/

		System.out.println("1년 동안의 전체 사용 금액 : " + total);
		System.out.println("월별 평균 사용금액 : " + avg);
		System.out.print("가장 지출이 많았던 월 : ");

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == max) {
				System.out.print((i + 1) + "월,");
			}
		}
		System.out.print("\b입니다.");
		/*
		가장 지출이 적었던 월도 위의 방법으로 코드를 수정하여
		결과를 확인해 봅시다.
		*/

		System.out.println("가장 지출이 적았던 월 : ");

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == min) {
				System.out.print((i + 1) + "월,");
			}
		}
		System.out.print("\b입니다.");
	}
}
