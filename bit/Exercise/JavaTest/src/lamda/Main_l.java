package lamda;

public class Main_l {

	public static void main(String[] args) {

		// 매개변수와 실행문만으로 작성한다.(접근자, 반환형, return 키워드 생략)
		Lamda01 l1 = (String s1, String s2, String s3) -> { System.out.println(s1 + "" + s2 + "" + s3); };
		l1.method("Hello", "Java", "World!");
		
		// 매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다.
		Lamda02 l2 = (s1) -> { System.out.println(s1); };
		l2.method("Hello");
		
		// 실행문이 1개일 때, '{}'를 생략할 수 있다.
		Lamda02 l3 = (s1) -> System.out.println(s1);
		l3.method("Hello");
		
		// 매개변수와 실행문이 1개일 때, '()'와 {}'를 생략할 수 있다.
		Lamda02 l4 = s1 -> System.out.println(s1);
		l4.method("Hello");
		
		// 매개변수가 없을 때, '()'만 작성한다.
		Lamda03 l5 = () -> System.out.println("no parameter");
		l5.method();
		
		// 반환값이 있는 경우
		Lamda04 l6 = (x, y) -> {
			int r = x + y;
			return r;
		};
		System.out.printf("l6.method(10, 20) : %d\n", l6.method(10, 20));
		
		l6 = (x, y) -> {
			int r = x * y;
			return r;
		};
		System.out.printf("l6.method(10, 20) : %d\n", l6.method(10, 20));
		
		l6 = (x, y) -> {
			int r = x - y;
			return r;
		};
		System.out.printf("l6.method(10, 20) : %d\n", l6.method(10, 20));
	}

}
