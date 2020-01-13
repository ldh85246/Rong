package com.bit.exam01;

import java.util.Scanner;

class NegativeBalnceException extends Exception {
	public NegativeBalnceException(String msg) {
		super(msg);
	}
}

class BankAccount {
	int balance;
	
	public void deposit(int d) {
		balance += d;
	}
	
	public void withdraw(int w) throws NegativeBalnceException {
		if (balance < w) {
			throw new NegativeBalnceException("잔액이 부족합니다.");
		}
		balance -= w;
		if (balance == 0) {
			throw new NegativeBalnceException("잔액이 0원입니다.");
		}
		System.out.println("현재 잔액은 " + balance + "입니다.");
	}
}

public class BankAccountTest {
	public static Scanner sc;
	public static void printMenu() {
		System.out.println("*** 은행 계좌 프로그램 ***");
		System.out.println("1. 입금, 2. 출금, 3. 잔액, 4. 종료");		
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			BankAccount ba = new BankAccount();
			ba.balance = 10000;
			int menu;
			while(true) {
				printMenu();
				menu = sc.nextInt();
				if (menu == 0) {
					break;	
				}
				switch (menu) {
				case 1 : depositMoney(ba);break;
				case 2 : withdrawMoney(ba);break;
				case 3 : printAllMoney(ba);break;
				}
			}
			System.out.println("입금할 금액을 입력하세요.");
			ba.deposit(sc.nextInt());
//			System.out.println("출금할 금액을 입력하세요.");
//			ba.withdraw(sc.nextInt());
		} catch (NegativeBalnceException e) {
			System.out.println("삐빅!" + e.getMessage());
		}
	}

	private static void depositMoney(BankAccount ba) throws NegativeBalnceException {
		System.out.println("입금할 금액을 입력하세요.");
		ba.deposit(sc.nextInt());
	}

	private static void withdrawMoney(BankAccount ba) throws NegativeBalnceException {
		System.out.println("출금할 금액을 입력하세요.");
		ba.withdraw(sc.nextInt());
	}
	
	private static void printAllMoney(BankAccount ba) throws NegativeBalnceException {
		
	}
}
