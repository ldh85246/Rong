class AddTest {
	public static void main(String[] args) {
		// 대문자 'A'와 소문자 'a'의 차이를 확인하세요.
		int a = (int)'A';
		int b = (int)'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(b - a);
		System.out.println(a + 32);

		/*
		char ch = 'A';
		System.out.println((char)(ch + 1));
		System.out.println('A' + 1);
		System.out.println('A' + "1");
		System.out.println(ch);
		System.out.println((int)ch);

		int a = 7 + 3;
		String b = "7" + "3";
		String c = "7" + 3;
		String d = "안녕" + 7 + 3;
		String f = 7 + 3 + "안녕";

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);

		System.out.println(7 + 3);
		System.out.println("7" + "3");
		System.out.println("7" + 3);
		*/
	}
}
