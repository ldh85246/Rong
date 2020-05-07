package object_class_constructor;

public class Bicycle {

	public String color;
	public int price;
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle Consructor - 1");
	}
	
	public Bicycle(String c, int p) {
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle Consructor - 2");
		this.color = c;
		this.price = p;
	}
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
