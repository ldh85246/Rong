abstract class Shape {
	protected int x;
	protected int y;
	protected double area;
	abstract public void calcArea();

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "도형의 위치 : (" + x + ", " + y + ") 도형의 면적 : " + area;
	}
}

class Rect extends Shape {
	private double width;
	private double height;

	public Rect(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height;
	}

	public String toString() {
		return "사각형 = " + super.toString() + " 가로의 길이 : " + width + " 세로의 길이 : " + height;
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(int x, int y, double radius) {
		super(x, y); // super 키워드는 부모로부터 먼저 만들어달라는 의미이기 때문에 첫 문장에 와야 함
		this.radius = radius;
	}

	public void calcArea() {
		area = radius * radius * Math.PI;
	}

	public String toString() {
		return "원 = " + super.toString() + " 반지름의 길이 : " + radius;
	}
}

class Triangle extends Shape {
	private double width;
	private double height;

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height * 0.5;
	}

	public String toString() {
		return "삼각형 = " + super.toString() + " 가로의 길이 : " + width + " 세로의 길이 : " + height;
	}
}

class ShapeTest {
	public static void main(String[] args) {
		Rect r = new Rect(20, 10, 10.5, 20.5);
		r.calcArea();
		System.out.println(r);

		Circle c = new Circle(20, 10, 10.5);
		c.calcArea();
		System.out.println(c);

		Triangle t = new Triangle(20, 10, 10.5, 20.5);
		t.calcArea();
		System.out.println(t);
	}
}
