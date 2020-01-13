class Person {
	protected String name;
	protected String addr;
	protected String tel;

	public Person() {
	}

    public Person(String name, String addr, String tel) {
        this.name = name;
        this.addr = addr;
        this.tel = tel;
	}

	public String toString() {
		return name + ", " + addr + ", " + tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

class Customer extends Person {
	private int no;
	private int point;

	public Customer() {
		// super();
	}

	public String toString() {
		return super.toString() + ", " + no + ", " + point;
	}

	public Customer(String name, String addr, String tel, int no, int point) {
		/*
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		*/
		super(name, addr, tel);
		this.no = no;
		this.point = point;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}

class CustomerTest{
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", "서울", "000-0000-0000");
		Customer c1 = new Customer("이수인", "서울", "010-0000-0000", 1000, 50000);

		System.out.println(p1);
		System.out.println(c1);
	}
}
