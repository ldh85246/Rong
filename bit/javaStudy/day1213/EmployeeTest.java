class Employee {
	private String name;
	private String call;
	private int salary;

	public void print(){
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + call);
		System.out.println("연봉 : " + salary);
	}

	public Employee(){
		name = "홍길동";
		call = "000-0000-0000";
		salary = 0;
	}

	public Employee(String name, String call, int salary){
		this.name = name;
		this.call = call;
		this.salary = salary;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setCall(String call){
		this.call = call;
	}
	public void setName(int salary){
		this.salary = salary;
	}

	public String getName(){
		return name;
	}
	public String getCall(){
		return call;
	}
	public int getSalary(){
		return salary;
	}

}

class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("이원우", "010-0000-0000", 300);
		e1.print();
		e2.print();
	}
}
