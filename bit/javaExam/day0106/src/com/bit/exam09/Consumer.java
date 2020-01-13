package com.bit.exam09;

public class Consumer extends Thread {
	Product p;

	public Consumer(Product p) {
		this.p = p;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(p.getNumber());
			p.getNumber();
			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}
}
