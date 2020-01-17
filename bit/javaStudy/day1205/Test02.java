class Test02 {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;

		int a = i++; // i의 값은 a에 대입하면 나증에 증가
		int b = ++j; // j의 값을 먼저 증가한 후 증가된 값이 b에 대입됨

		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
	}
}
