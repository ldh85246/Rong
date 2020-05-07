package interface_;

public class Main_if {

	public static void main(String[] args) {

//		Interface_a ia = new InterfaceClass();
//		Interface_b ib = new InterfaceClass();
//		
//		ia.funA();
//		ib.funB();
		
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy[] toys = {robot, airplane};
		
		for (int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
		}
	}
}
