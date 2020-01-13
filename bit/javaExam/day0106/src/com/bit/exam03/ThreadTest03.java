package com.bit.exam03;

import java.util.Date;

class MyThread extends Thread {
	public void run() {
		while (true) {
			Date today = new Date();
			System.out.println(today + "æ»≥Á«œººø‰?");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadTest03 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
