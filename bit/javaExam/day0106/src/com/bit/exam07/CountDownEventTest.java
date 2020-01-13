package com.bit.exam07;

class CountDown extends Thread {
	public void run() {
		for (int i = 20; i > 0; i--) {
			System.out.println(i + "초 전입니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("발사!!");
	}
}

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
		CountDown cd = new CountDown();
		CountDownEvent cde = new CountDownEvent(2000, "연결 장치 분리!");
		cd.start();
		cde.start();
	}
}
