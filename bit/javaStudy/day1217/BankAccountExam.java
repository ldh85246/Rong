/*
pdf "객체와 클래스"의 Lab 3번을 프로그래밍 합니다.
*/

class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
	}

	public void printBalance() {
		System.out.println("현재 잔액 : " + balance);
	}

	public void addInterest() {
		balance = balance * 1.075;
	}

	public static void main(String []args) {
		System.out.println("이거 동작해요?");
	}
}

class BankAccountExam {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		a1.setBalance(100);
		// a1. deposit(100);
		a2.setBalance(50);

		a1.withdraw(60);
		a2.withdraw(30);

		System.out.println("a1의 잔고 : " + a1.getBalance());
		System.out.println("a2의 잔고 : " + a2.getBalance());

		a1.printBalance();
		a2.addInterest();

		a1.printBalance();
		a2.printBalance();

        a1.withdraw(30);
        a1.withdraw(20);
        a1.printBalance();
	}
}
