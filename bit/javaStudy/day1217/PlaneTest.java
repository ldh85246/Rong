class PlaneTest {
	public static void main(String[] args) {
		System.out.println("비행기 대수 : " + Plane.getPlanes());

		Plane p1 = new Plane();
		Plane p2 = new Plane("Air Bus", "A380", 500);

        System.out.println("비행기 대수 : " + Plane.getPlanes());
        System.out.println("클래스맴버에 객체를 통해서도 접근가능!");
        System.out.println("p1을 통해서 확인 : " + p1.getPlanes());
        System.out.println("p2를 통해서 확인 : " + p2.getPlanes());

		System.out.println(p1.getCompany());
		System.out.println(p1.getModel());
		System.out.println(p1.getSeats());

		p1.setCompany("보잉");
		p1.setModel("보잉747");
		p1.setSeats(200);

		System.out.println(p1);
		System.out.println(p2);
	}
}

class Plane {
	private String company;
	private String model;
	private int seats;

	public static int planes;
	public static int getPlanes() {
		return planes;
	}

	public Plane() {
		planes = planes + 1; // planes++로도 가능!
	}

	public Plane(String company, String model, int seats) {
		this.company = company;
		this.model = model;
		this.seats = seats;
		planes = planes + 1; // planes++로도 가능!
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String toString() {
		return "제작사 : " + company + ", 모델 : " + model +
		", 최대 승객수 : " + seats + "]";
	}
}
