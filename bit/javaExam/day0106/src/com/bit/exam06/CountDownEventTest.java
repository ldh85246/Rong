package com.bit.exam06;

class CountDownEvent extends Thread {
	int delay;
	String msg;
	
	public CountDownEvent(int delay, String msg) {
		this.delay = delay;
		this.msg = msg;
	}
	
	public void run() {
		try {
			Thread.sleep(delay);
			System.out.println(msg);
		} catch (Exception e) {
			
		}
	}
}

public class CountDownEventTest {

	public static void main(String[] args) {
		CountDownEvent cde = new CountDownEvent(5000, "¾È³ç");
		cde.start();
	}
}
