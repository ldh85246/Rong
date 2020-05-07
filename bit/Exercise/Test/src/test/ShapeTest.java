package test;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

abstract class Shape {
	int x, y;
	double area;
	
	public abstract void calcArea();

	public Shape() {
		
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class square extends Shape {
	double width, height;

	public square(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = width * height;
	}
}