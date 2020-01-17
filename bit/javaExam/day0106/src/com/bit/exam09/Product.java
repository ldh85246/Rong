package com.bit.exam09;

import java.util.Random;

public class Product {
	private int number;
	public boolean isNew;
	
	public synchronized int getNumber() {

		while(isNew == false) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println("소비자가 소비함 : " + number);
		isNew = false;
		notify();
		return number;
	}
	
	public synchronized void makeNumber() {
		
		while(isNew == true) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		
		Random r = new Random();
		number = r.nextInt(100) + 1;
		System.out.println("생산자가 생산함 : " + number);
		isNew = true;
		notify();
	}
}
