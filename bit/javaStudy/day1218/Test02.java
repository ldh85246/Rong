abstract class Employee {
	protected String name;
	protected int id;
	protected int salary;
	abstract public void computeSalary();

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString(){
		String r = name + ", " + id;
		return r;
	}
}

class SalariedEmployee extends Employee {
	private int level;	// 호봉
	private int base;	// 기본급
	private int comm;	// 수당

	public SalariedEmployee(String name, int id, int level) {
		super(name, id);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public void computeSalary() {
		switch(level){
			case 1: base = 200; comm = 20;break;
			case 2: base = 300; comm = 30;break;
			case 3: base = 500; comm = 50;break;
		}
		salary = base + comm;
	}

	public String toString() {
		String r =  super.toString() + "\n";
		r = r + "호봉:" + level + "\n";
		r = r + "기본금 : " + base + "\n";
		r = r + "수당:" + comm + "\n";
		r = r + "실수령액 : " + salary ;
		return r;
	}
}

class HourlyEmployee extends Employee {
	private int base;   //시간당 임금
	private int hours;  //일한 시간

	public HourlyEmployee(String name, int id, int base, int hours) {
		super(name, id);
		this.base = base;
		this.hours = hours;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void computeSalary() {
		salary = base * hours;
	}

	public String toString() {
		String r = "\n" + super.toString() + "\n";
		r = r + "시간당 임금 : " + base + "\n";
		r = r + "일한 시간:" + hours + "\n";
		r = r + "실수령액 : " + salary ;
		return r;
	}
}

class Test02 {
	public static void main(String[] args) {
		SalariedEmployee e1 = new SalariedEmployee("나미", 02, 3);
 
		HourlyEmployee e2 = new HourlyEmployee("루피", 1, 8350, 52);
         
		e1.computeSalary();
		e2.computeSalary();

		System.out.println(e1);
		System.out.println(e2);
	}
}
