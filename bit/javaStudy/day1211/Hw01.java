import java.util.Scanner;

class Hw01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][]a = new String[5][6];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < a.length; i++) {
			// for (int j = 0; j < a[i]length; j++) {
			System.out.print("학생의 이름을 입력하세요 ==> ");
			a[i][0] = scan.next();
			System.out.print("국어 점수를 입력하세요 ==> ");
			a[i][1] = scan.next();
			System.out.print("영어 점수를 입력하세요 ==> ");
			a[i][2] = scan.next();
			System.out.print("수학 점수를 입력하세요 ==> ");
			a[i][3] = scan.next();
			// }
			a[i][4] = Double.toString(Double.parseDouble(a[i][1]) + Double.parseDouble(a[i][2]) + Double.parseDouble(a[i][3]));
			a[i][5] = Double.toString(Double.parseDouble(a[i][4]) / 3);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Double.parseDouble(a[i][4]) < Double.parseDouble(a[j][4])) {
					String[] strTemp = new String[6];
					strTemp = a[i];
					a[i] = a[j];
					a[j] = strTemp;
				}
			}
		}

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < a.length; i++) {
			// for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][0] + "\t");
			System.out.print(a[i][1] + "\t");
			System.out.print(a[i][2] + "\t");
			System.out.print(a[i][3] + "\t");
			System.out.print(a[i][4] + "\t");
			System.out.println(a[i][5] + "\t");
			// }
		}
	}
}
