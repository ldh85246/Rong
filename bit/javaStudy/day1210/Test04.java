import java.util.Scanner;

class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String t = "";

		System.out.print("문자를 입력하세요 ==> ");
		t = scan.next();

		if (t.length() >= 2) {
			System.out.print("한글자만 입력해주세요!");
			return;
		}

		switch (t) {
		case "A": case "E": case "I": case "O": case "U": 
		case "a": case "e": case "i": case "o": case "u": 
			System.out.print("모음입니다!"); break;
		default :
			System.out.print("자음입니다!");
		}
	}
}
