package com.bit.exam09;

public class Producer extends Thread {
	Product p;

	public Producer(Product p) {
		this.p = p;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			p.makeNumber();
			try {
				Thread.sleep(200);
			} catch (Exception e) {

			}
		}
	}
}
