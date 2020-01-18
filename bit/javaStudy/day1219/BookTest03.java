class Book {
	protected int number;
	protected String title;
	protected String author;

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

	public String toString() {
		return "\n������ȣ : " + number + "\n���� : " + title + "\n���� : " + author + "\n";
	}
}

class BookTest03 {
	public static void main(String[] args) {
		Book b1 = new Book(100, "����ִ� �ڹ�", "�̿���");
		Book b2 = new Book(100, "����ִ� �ڹ�", "�̿���2");

		if (b1.equals(b2)) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}