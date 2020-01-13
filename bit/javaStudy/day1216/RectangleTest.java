class RectangleTest {
	public static void main(String[] args) {
		Rectangle r;					// 참조자료형 변수(클래스형 변수)
										// 변수 자신이 "값"을 가지지 않음
										// "값"이 있는 메모리 상의 주소를 가짐

										// 클래스형 변수는 객체를 생성하고
										// 그 객체를 통해서 사용할 수 있음

		r = new Rectangle();			// 객체를 생성함
										// Rectangle의 자료형을 참조할 수 있는 변수
										// r이 Rectangle의 객체를 생성하고
										// 생성된 그 객체의 메모리 상의 주소를 참조함

										// 즉, Rectangle의 자료형을 참조할 수 있는
										// 변수 r이 Rectangle의 객체를 생성하고
										// 생성된 그 객체의 주소를 참조함

										// r.width = 20; 접근불가
										// setter를 통해서 접근해야 함

		int n;							// 기본자료형 변수
										// 변수 자신이 "값"을 가짐
		n = 29;

		// r.setWidth(20);
		// r.setLength(10);
		System.out.println("사각형의 면적 : " + r.calcArea());

		r.setWidth(40);
		System.out.println("사각형의 면적 : " + r.calcArea());

		Rectangle r2 = new Rectangle(5, 7);
		System.out.println("r2의 면적 : " + r2.calcArea());

		Rectangle r3 = new Rectangle(10);
		System.out.println("r3의 면적 : " + r3.calcArea());

		Rectangle r4 = new Rectangle(10.8);
		System.out.println("r4의 면적 : " + r4.calcArea());
	}
}

class Rectangle {
	private int width;
	private int length;

	public Rectangle() {
		width = 10;
		length = 20;
	}
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(int width) {
		this.width = width;
		length = 2;
	}
	public Rectangle(double width) {
		this.width = (int) width;
		length = 2;
	}
/*
	public Rectangle(int length) {
		this.length = length;
		width = 2;
	}
	얘는 불가!
*/

	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}

	public int calcArea() { // 메소드
		return width * length;
	}
}
