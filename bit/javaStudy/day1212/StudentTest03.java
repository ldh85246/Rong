import java.util.Scanner;

class Student {
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}

class StudentTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Student s = new Student();

		/* Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student(); */

		Student []s = new Student[5];
		/* s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		s[3] = new Student();
		s[4] = new Student(); */

		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.print("학생의 이름을 입력하세요 ==> ");
			s[i].name = scan.next();
			System.out.print((i + 1) + "번째 학생의 국어 점수를 입력하세요 ==> ");
			s[i].kor = scan.nextInt();
			System.out.print((i + 1) + "번째 학생의 양어 점수를 입력하세요 ==> ");
			s[i].eng = scan.nextInt();
			System.out.print((i + 1) + "번째 학생의 수학 점수를 입력하세요 ==> ");
			s[i].math = scan.nextInt();
			s[i].tot = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].tot / 3.0;
		}

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[j].tot > s[i].tot) {
					Student tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}

		// 5명 학생의 정보를 출력하기 위해 문장을 완성하여 결과를 확인
		for (int i = 0; i < s.length; i++) {
		System.out.println("*** 성적 결과 ***");
		System.out.printf("%s\t%d\t%d\t%d\t%d%\t.2f\n", s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].tot, s[i].avg);
		}
	}
}
