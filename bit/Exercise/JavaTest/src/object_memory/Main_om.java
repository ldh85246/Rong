package object_memory;

public class Main_om {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
//		ObjectClass obj3 = new ObjectClass();
//		
//		System.out.println("obj1 : " + obj1);
//		System.out.println("obj2 : " + obj2);
//		System.out.println("obj3 : " + obj3);
		
		obj1.getInfo();
		obj1 = null;	// 레퍼런스 x
//		obj1 = getInfo();
		
		obj2.getInfo();
	}

}
