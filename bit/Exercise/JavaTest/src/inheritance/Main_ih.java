package inheritance;

public class Main_ih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirstChildClass fch = new FirstChildClass();
//		fch.childFun();
//		fch.parentFun();
//		fch.makeJJajang();
		
		ParentClass[] childs = new ParentClass[2];
		
//		childs[0] = new FirstChildClass();
//		childs[1] = new SecondChildClass();
		
		FirstChildClass fch = new FirstChildClass();
		SecondChildClass sch = new SecondChildClass();
		
		childs[0] = fch;
		childs[1] = sch;
		
		for (int i = 0; i < childs.length; i++) {
			childs[i].makeJJajang();
			
		}
	}

}
