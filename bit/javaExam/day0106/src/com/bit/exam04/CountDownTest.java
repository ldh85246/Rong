package com.bit.exam04;

class CountDown implements Runnable {
	public void run() {
		for (int i = 20; i > 0; i--) {
			System.out.println(i + "초 전입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class CountDownTest extends Thread {

	public static void main(String[] args) {
		CountDown cd = new CountDown();
		(new Thread(cd)).start();
	}
}
