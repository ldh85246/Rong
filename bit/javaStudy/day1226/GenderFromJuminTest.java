import java.util.Scanner;

class Jumin {
	public static boolean isCorrectJumin(String jumin) {
		boolean re = true;
		int[] arr = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		if (jumin.length() != 14) {
			re = false;
			return re;
		}

		if (jumin.charAt(6) != '-') {
			re = false;
			return re;
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
		if (tot != check) {
			re = false;
		}

		return re;
	}

	public static String getGender(String jumin) {
		String re = "남자";
		int f = Integer.parseInt(jumin.substring(7, 8));
		
		if (f % 2 == 0) {
			re = "여자";
		}
		return re;
	}
}

class GenderFromJuminTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String jumin;
	System.out.println("주민등록번호를 입력하세요");
	jumin = sc.next();
	
	if (Jumin.isCorrectJumin(jumin) == false) {
		System.out.println("주민등록번호 재확인 바람");
		return;
	}

	String gender = Jumin.getGender(jumin);
	System.out.println("성별은" + gender + "입니다.");
	}
}
