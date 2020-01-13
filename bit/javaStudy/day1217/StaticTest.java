class Family {
	public String name;
	public int age;
	public static String addr; // 객체마다 공동으로 사용하는 기억공간
}

class StaticTest {
	public static void main(String[] args) {
		Family.addr = "서울시 서대문구 홍제동";
		Family f1 = new Family();
		Family f2 = new Family();
		f1.name = "이수인";
		f1.age = 20;
		f2.name = "이인준";
		f2.age = 21;
		System.out.println(f1.name + ", " + f1.addr);
		System.out.println(f2.name + ", " + f2.addr);

		f1.addr = "부산광역시 서면 신수동";
		System.out.println(f1.name + ", " + f1.addr);
		System.out.println(f2.name + ", " + f2.addr);
		System.out.println("우리 가족의 주소 : " + Family.addr);
	}
}
