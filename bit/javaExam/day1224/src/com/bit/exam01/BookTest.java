package com.bit.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	public static Scanner sc;
	
	public static void printMenu() {
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("1. 등록, 2. 수정, 3. 삭제, 4. 모두 출력, 5. 가격 오름차순 정렬, 0. 종료");
		System.out.print("메뉴를 선택하세요 ==> ");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		int menu;
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;	
			}
			switch(menu) {
			case 1 : insertBook(list); break;
			case 2 : updateBook(list); break;
			case 3 : deleteBook(list); break;
			case 4 : printAllBook(list); break;
			case 5 : sortBook(list); break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private static void insertBook(ArrayList<Book> list) {
		int no, price;
		String title, writer, publisher;
		System.out.println("*** 등록 ***");
		System.out.print("등록할 도서번호 : ");
		no = sc.nextInt();
		System.out.print("등록할 도서명 : ");
		title = sc.next();
		System.out.print("등록할 도서의 저자 : ");
		writer = sc.next();
		System.out.print("등록할 도서 가격 : ");
		price = sc.nextInt();
		System.out.print("등록할 도서 출판사 : ");
		publisher = sc.next();
		
		Book b = new Book(no, title, writer, price, publisher);
		list.add(b);
	}

	private static void updateBook(ArrayList<Book> list) {
		int no, price;
		String title, writer, publisher;
		System.out.println("*** 도서 수정 ***");
		System.out.print("수정할 도서번호 : ");
		no = sc.nextInt();
		System.out.print("수정할 도서명 : ");
		title = sc.next();
		System.out.print("수정할 도서의 저자 : ");
		writer = sc.next();
		System.out.print("수정할 도서 가격 : ");
		price = sc.nextInt();
		System.out.print("수정할 도서 출판사 : ");
		publisher = sc.next();
		
		Book b = new Book(no, title, writer, price, publisher);
		int i;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				list.set(i, b);
				System.out.println("해당 도서를 수정했습니다.");
				break;
			}
		}
		if (i == list.size()) {
			System.out.println("도서 수정에 실패했습니다.");
			System.out.println("해당 도서는 존재하지 않습니다.");
		}
	}

	private static void deleteBook(ArrayList<Book> list) {
		int no;
		System.out.println("*** 도서 삭제 ***");
		System.out.println("삭제할 도서의 번호를 입력하세요 ==> ");
		no = sc.nextInt();
		boolean flag = false;
		
		for (Book b : list) {
			if (b.getNo() == no) {
				list.remove(b);
				System.out.println("해당 도서를 삭제했습니다.");
				break;
			}
		}
		if (flag == false) {
			System.out.println("도서 삭제에 실패했습니다.");
		}
	}

	private static void printAllBook(ArrayList<Book> list) {
		System.out.println("*** 모든 도서 목록 ***");
		System.out.println("도서번호\t도서명\t저자\t가격\t출판사");
		for (Book b : list) {
			System.out.println(b.getNo() + "\t" + b.getTitle() + "\t" + b.getWriter() + "\t" + b.getPrice() + "\t" + b.getPublisher());
		}
	}
	private static void sortBook(ArrayList<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).getPrice() < list.get(i).getPrice()) {
					Book b = list.get(i);
					list.set(i, list.get(j));
					list.set(j, b);
				}
			}
		}
	}
}
