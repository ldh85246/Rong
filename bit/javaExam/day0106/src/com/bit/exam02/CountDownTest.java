package com.bit.exam02;

class CountDownThread extends Thread {
	int sec;

	public CountDownThread(int sec) {
		this.sec = sec;
	}

	public void run() {
		while (sec >= 0) {
			System.out.println(sec + "초 전입니다.");
			sec--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class CountDownRunnable implements Runnable {
	int sec;

	public CountDownRunnable(int sec) {
		this.sec = sec;
	}

	@Override
	public void run() {
		while (sec >= 0) {
			System.out.println(sec + "초 전입니다.");
			sec--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class CountDownEvent extends Thread {
	int waitsec;
	String message;

	public CountDownEvent(int waitsec, String message) {
		this.waitsec = waitsec;
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < waitsec; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(message);
	}
}

public class CountDownTest {
	public static void main(String[] args) {
		CountDownThread t1 = new CountDownThread(10);
//      t1.start();
		CountDownRunnable t2 = new CountDownRunnable(15);
		(new Thread(t2)).start();

		CountDownEvent t3 = new CountDownEvent(7, "연결 장치 분리!");
		t3.start();
//      int seconds = 20;
//      
//      while(seconds >= 0) {
//         System.out.println(seconds + "초 전입니다.");
//         seconds--;
//         try {
//            Thread.sleep(1000);
//         }catch(InterruptedException e) {
//            System.out.println(e);
//         }
//      }
	}
}