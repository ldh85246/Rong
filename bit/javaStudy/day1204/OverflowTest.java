class OverflowTest {
	public static void main(String[] args) {
		byte a;
		a = 127;
		a = (byte)(a + 1); //형변환 후 강제 실행
		System.out.println(a);
	}
}
