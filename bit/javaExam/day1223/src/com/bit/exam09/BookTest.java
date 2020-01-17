package com.bit.exam09;

import java.util.ArrayList;
import java.util.Scanner;

import com.bit.exam08.Student;

public class BookTest {
	public static Scanner sc;

	public static void printMenu() {
		System.out.println("*** 도서 정보 프로그램 ***");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 모두 출력");
		System.out.println("0. 종료");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		
		int menu;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			switch (menu) {
			case 1 : registerBook(list); break;
			case 2 : reviseBook(list); break;
			case 3 : deleteBook(list); break;
			case 4 : printAllBook(list); break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}


	private static void registerBook(ArrayList<BookInfo> list) {
		String number, title, author, price, publisher;
		System.out.println("새로운 도서를 등록합니다.");
		System.out.print("도서번호를 입력하세요 ==> ");
		number = sc.next();
		System.out.print("도서명을 입력하세요 ==> ");
		title = sc.next();
		System.out.print("저자를 입력하세요 ==> ");
		author = sc.next();
		System.out.print("가격을 입력하세요 ==> ");
		price = sc.next();
		System.out.print("출판사를 입력하세요 ==> ");
		publisher = sc.next();

		list.add(new BookInfo(number, title, author, price, publisher));
	}
	private static void reviseBook(ArrayList<BookInfo> list) {
		
	}
	private static void deleteBook(ArrayList<BookInfo> list) {
		String number, title, author, price, publisher;
		System.out.println("*** 도서 검색 ***");
		System.out.println("삭제할 도서의 번호를 입력하세요 ==> ");
		number = sc.next();
		int re = 0;
		
		for (BookInfo bi : list) {
			if (bi.getNumber().equals(number)) {
				list.remove(bi);
				System.out.println("해당 도서의 정보를 삭제하였습니다.");
				re = 1;
				break;
			}
		}
		if (re == 0) {
			System.out.println("검색된 도서가 없습니다.");
		}
	}
	private static void printAllBook(ArrayList<BookInfo> list) {
		System.out.println("*** 모든 도서 확인 ***");
		System.out.println("도서번호\t도서명\t저자\t가격\t출판사");
		for (BookInfo bi : list) {
			System.out.println(bi.getNumber() + "\t" + bi.getTitle() + "\t" + bi.getAuthor() + "\t" + bi.getPrice() + "\t" + bi.getPublisher());
		}
	}
}
