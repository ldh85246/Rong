/*
ex) 다음의 기능을 갖도록 메소드를 중복하세요.
- 정수 두개 중에 큰 수를 반환하는 메소드
- 정수 세개 중에 큰 수를 반환하는 메소드
- 실수 두개 중에 큰 수를 반환하는 메소드
- 정수 배열 중에 큰 수를 반환하는 메소드
- 실수 배열 중에 큰 수를 반환하는 메소드
*/

class OverlapMethod {
	public static void main(String[] args) {
		Example e = new Example();
		int []a = {1, 2, 3};
		double []b = {29.9, 28.9};

		System.out.println(e.max(29, 25));
		System.out.println(e.max(30, 26, 29));
		System.out.println(e.max(25.9, 29.9));
		System.out.println(e.max(a));
		System.out.println(e.max(b));
	}
}

class Example {
	public int max(int a, int b) {
		int r;
		
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r;
	}

	public int max(int a, int b, int c) {
		int r;

		if (a > b && a > c) {
			r = a;
		}
		else if (b > a && b > c) {
			r = b;
		}
		else {
			r = c;
		}
		return r;
	}

	public double max(double a, double b) {
		double r;

		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r;
	}

	public int max(int []a) {
		int r = a[0];

		for (int i = 0; i < a.length; i++) {
			if (r < a[i]) {
				r = a[i];
			}
		}
		return r;
	}

	public double max(double []a) {
		double r = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (r < a[i]) {
				r = a[i];
			}
		}
		return r;
	}
}
