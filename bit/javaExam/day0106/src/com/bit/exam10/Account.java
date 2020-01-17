package com.bit.exam10;

public class Account {
	private int balance;

	public synchronized void deposit(int amount) {
		balance = balance + amount;
	}

	public synchronized int getBalance() {
		return balance;
	}
}
