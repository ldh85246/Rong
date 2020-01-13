import java.util.Scanner;

class CorrectJuminTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민등록번호를 입력하세요(하이픈 포함!) ==> ");
		jumin = sc.next();
		System.out.println("입력한 주민번호는 : " + jumin + "입니다.");

//	920404-2345678
//	ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

		int[] arr = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		if (jumin.length() != 14) {
			System.out.println("올바른 주민등록번호가 아닙니다.");
			return;
		}

		if (jumin.charAt(6) != '-') {
			System.out.println("하이픈(-)을 입력해주세요.");
			return;
		}

		int tot = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			if (i == 6) {
				continue;
			}
			tot = tot + Integer.parseInt (jumin.charAt(i) + "") * arr[i];
		}
		tot = tot % 11;
		tot = 11 - tot;

		if (tot == 10) {
			tot = 0;
		}
		if (tot == 11) {
			tot = 1;
		}

		int check = Integer.parseInt(jumin.charAt(13) + "");
		if (tot == check) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바른 주민등록번호가 아닙니다.");
		}
	}
}
