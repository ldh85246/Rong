class Guitar { // �� ����, ���̸� �����
	private String brand;
	private int guitarStrings;
	private String tune;

	public void print(){
		System.out.println("�귣��� : " + brand);
		System.out.println("��Ÿ �� �� : " + guitarStrings + "��");
		System.out.println("������ ���̸� : " + tune);
	}

	public Guitar(){
		brand = "YAMAHA";
		guitarStrings = 6;
		tune = "E, A, D, G, B, E";
	}

	public Guitar(String brand, int guitarStrings, String tune){
		this.brand = brand;
		this.guitarStrings = guitarStrings;
		this.tune = tune;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setGuitarStrings(int guitarStrings) {
		this.guitarStrings = guitarStrings;
	}

	public void setTune(String tune) {
		this.tune = tune;
	}

	public String getBrand(){
		return brand;
	}

	public int getGuitarStrings(){
		return guitarStrings;
	}

	public String getTune(){
		return tune;
	}
}

class Hw01 {
	public static void main(String[] args) {
		Guitar g = new Guitar();
		g.print();
	}
}