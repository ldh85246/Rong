class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("박도형", "010-1111-1111", 10000, 3.0);
		BankAccount b2 = new BankAccount();

		System.out.println("첫번째 계좌의 정보");
		System.out.println("이름 : " + b2.getName());
		System.out.println("계좌번호 : " + b2.getNo());
		System.out.println("잔액 : " + b2.getBalance());
		System.out.println("이자율 : " + b2.getRate());
		System.out.println("==============================");
		System.out.println("두번째 계좌의 정보");
		System.out.println("이름 : " + b1.getName());
		System.out.println("계좌번호 : " + b1.getNo());
		System.out.println("잔액 : " + b1.getBalance());
		System.out.println("이자율 : " + b1.getRate());
	}
}

class BankAccount {
	private String name;
	private String no;
	private double balance;
	private double rate;

	public BankAccount() {	
	}

	public BankAccount(String name, String no, double balance, double rate) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}

