package abstract_;

public class MyBank extends Bank {
	
	public MyBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
	}

	@Override
	public void installmentSavings() {
		System.out.println("-- installmentSavings() START --");
	}

	@Override
	public void cancellaion() {
		System.out.println("-- cancellaion() START --");
	}

}
