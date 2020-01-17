class MethodOverloadingTest {
	public static void main(String[] args) {
		BitUtil bu = new BitUtil();
		bu.add(10, 20);
		bu.add(5.7, 5.2);
		bu.add(2, 3, 4);
		bu.add(5, 5.5);
	}
}

class BitUtil {
	public void add(int a, int b) {
		int r = a + b;
		System.out.println("더하기 결과 : " + r);
	}

	public void add(double a, double b) {
		double r = a + b;
		System.out.println("더하기 결과 : " + r);
	}

	public void add(int a, int b, int c) {
		int r = a + b + c;
		System.out.println("더하기 결과 : " + r);
	}

	public void add(int i, double j) {
		double r = i + j;
		System.out.println("더하기 결과 : " + r);
	}
}