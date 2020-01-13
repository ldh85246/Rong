package com.bit.exam10;

public class TvArsTest {

	public static void main(String[] args) {
		Account account = new Account();
		Contributer cb1 = new Contributer("홍길동", account);
		Contributer cb2 = new Contributer("이순신", account);
		Contributer cb3 = new Contributer("유관순", account);
		Contributer cb4 = new Contributer("김유신", account);
		Contributer cb5 = new Contributer("강감찬", account);

		cb1.start();
		cb2.start();
		cb3.start();
		cb4.start();
		cb5.start();

		try {
			cb1.join();
			cb2.join();
			cb3.join();
			cb4.join();
			cb5.join();
		} catch (Exception e) {

		}

		System.out.println("전체 모금액 : " + account.getBalance());
	}
}
