class Hw02_05 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("È«±æµ¿", "010-0000-0000", 999999999, 27.9);
		ba.info();
	}
}

class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	private double interestRate;

	public void info() {
		System.out.println("ÀÌ¸§ : " + name);
		System.out.println("°èÁÂ¹øÈ£ : " + accountNumber);
		System.out.println("ÀÜ¾× : " + balance);
		System.out.println("ÀÌÀÚÀ² : " + interestRate);
	}

	public BankAccount() {
	}

	public BankAccount(String name, String accountNumber, int balance, double interestRate) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
