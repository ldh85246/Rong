import java.util.Scanner;

class Weight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파운드를 입력하세요.");
		int i = scan.nextInt();
		double lb = i * (double) 454;
		System.out.printf("몸무게는 파운드로 %dlb이고, 그램으로 환산시 %.3fg이다.", i, lb);
	}
}
