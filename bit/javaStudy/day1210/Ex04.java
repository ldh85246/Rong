class Ex04 {
	public static void main(String[] args) {
		int age;
		if (age > 0 && age < 18) {
			System.out.println("청소년");
		}

		int x;
		if (x == 0) {
			System.out.println("x는 0이다.");
		}

		String grade = (double) (3.0);
		switch (grade) {
			case 4.5 : System.out.println("만점"); break;
			case 0.0 : System.out.println("영점"); break;
		}
	}
}
