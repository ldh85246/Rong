class Student {
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}

class StudentTest02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동"; // . = 멤버접근지정자
		s.kor = 100;
		s.eng = 50;
		s.math = 80;
		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot / 3.0;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
			s.name, s.kor, s.eng, s.math, s.tot, s.avg);
	}
}