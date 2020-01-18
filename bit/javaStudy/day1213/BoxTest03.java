class Box {
	private double width;
	private double length;
	private double height;
	private double volume;

	public Box() { // �����ڴ� ��ü ������ �ڵ� ����, ������ ����.
		width = 10;
		length = 5;
		height = 4;

		System.out.println("������ �ڵ� ����!");
	}

/* �������� �ߺ�
	�Ű������� �ڷ����� �ٸ��ų� �Ű������� ������ �޶�� ������ ���� */
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		/*System.out.println(width * length * height);*/
		volume = width * length * height;
	}
}

class BoxTest03 {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20, 30, 5);
		/* b1.setWidth(10);
		b1.setLength(5);
		b1.setHeight(2); */
		b1.calcVolume();
		System.out.println("** ù��° �ڽ��� ���� **");
		System.out.println("���� : " + b1.getWidth());
		System.out.println("���� : " + b1.getLength());
		System.out.println("���� : " + b1.getHeight());
		System.out.println("���� : " + b1.getVolume());

		b2.calcVolume();
		System.out.println("** �ι�° �ڽ��� ���� **");
		System.out.println("���� : " + b2.getWidth());
		System.out.println("���� : " + b2.getLength());
		System.out.println("���� : " + b2.getHeight());
		System.out.println("���� : " + b2.getVolume());
	}
}