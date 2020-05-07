package object_class_constructor;

public class Grandeur {
	
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() {
		// TODO Auto-generated constructor stub
		System.out.println("Grandeur Constructor");
	}
	
	public void run() {
		System.out.println("-- run() --");
	}
	
	public void stop() {
		System.out.println("-- stop() --");
	}
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
