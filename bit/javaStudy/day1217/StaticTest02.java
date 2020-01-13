class Family {
	public String name;
	public int age;
	public static String addr; // 객체마다 공동으로 사용하는 기억공간

	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println(name + ", " + age + ", " + addr);
	}

	public static void move() {
		System.out.println("아아 정들었던 나의 집을 떠나 이사를 갑니다.");
		addr = "서울시 마포구 신수동"; // 가능
		name = "홍길동"; // 불가능
		age = 50; // 불가능
	}
}

class StaticTest02 {
	public static void main(String[] args) {
		Family.move();
		/*
		Family.addr = "서울시 서대문구 홍제동";
		Family f1 = new Family("이수인", 20);
		Family f2 = new Family("이원우", 23);
		f1.info();
		f2.info();
		*/
	}
}
