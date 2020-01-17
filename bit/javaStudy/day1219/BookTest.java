abstract class Book {
	protected int number;
	protected String title;
	protected String author;
	abstract public int getLateFees(int day);

	public Book(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public boolean equals(Object obj) {
		Book b = (Book)obj;
		if (number == b.number) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "\n관리번호 : " + number + "\n제목 : " + title + "\n저자 : " + author + "\n";
	}
}

class Novel extends Book {
	public Novel(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 300;
	}

/*
	public String toString() {
		return super.toString() + ", 연체료 : ";
	}
*/
}

class Poet extends Book {
	public Poet(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 200;
	}

/*
	public String toString() {
		return super.toString() + ", 연체료 : ";
	}
*/
}

class ScienceFiction extends Book {
	public ScienceFiction(int number, String title, String author) {
		super(number, title, author);
	}

	public int getLateFees(int day) {
		return day * 600;
	}

/*
	public String toString() {
		return super.toString() + ", 연체료 : ";
	}
*/
}

class BookTest {
	public static void main(String[] args) {
		Novel n1 = new Novel(1000, "데미안", "헤르만 헤세");
		Poet p1 = new Poet(2000, "꽃을 보듯 너를 본다", "나태주");
		ScienceFiction s1 = new ScienceFiction(3000, "숨", "테드 창");

		System.out.println(n1 + "연체료 : " + n1.getLateFees(2));
		System.out.println(p1 + "연체료 : " + p1.getLateFees(2));

		Poet p2 = new Poet(2000, "꽃을 보듯 너를 본다", "나태주");
		if (p1.equals(p2)) {
			System.out.println("\n동일한 책은 대여가 불가합니다.");
		}
		else {
			System.out.println("\n대여가 가능합니다.");
		}
	}
}
