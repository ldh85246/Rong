package method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child1 = new ChildClass();
		
//		child1.name = "홍길동";
//		child1.gender = "M";
//		child1.age = 20;
		
		child1.setInfo("홍길동", "m", 20);
		
		child1.getInfo();
		
//		child1.mySceret();
	}

}
