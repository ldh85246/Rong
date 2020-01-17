package com.bit.exam07;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentTest {
	private static void registerStudent(ArrayList<Student> list) {
		String name, addr, tel;
		Scanner sc = new Scanner(System.in);
		System.out.println("새로운 학생을 등록합니다.");
		System.out.print("학생의 이름을 입력하세요 ==> ");
		name = sc.next();
		System.out.print("학생의 주소를 입력하세요 ==> ");
		addr = sc.next();
		System.out.print("학생의 전화번호를 입력하세요 ==> ");
		tel = sc.next();
		
		// Student st = new Student(name, addr, tel);
		// list.add(st);
		list.add(new Student(name, addr, tel));
	}
	public static void searchStudent(ArrayList<Student> list) {
	}
	public static void deleteStudent(ArrayList<Student> list) {
	}
	private static void printAllStudent(ArrayList<Student> list) {
		System.out.println("*** 모든 학생 등록 ***");
		System.out.println("이름\t주소\t전화");
		for (int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			System.out.println(st.getName() + "\t" + st.getAddr() + "\t" + st.getTel());
		}
	}
	
	public static void printMenu () {
		System.out.println();
		System.out.println("1 : 등록");
		System.out.println("2 : 검색");
		System.out.println("3 : 삭제");
		System.out.println("4 : 모두 출력");
		System.out.println("0 : 종료");
		System.out.print("메뉴를 선택하세요 ==> ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		int menu;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			if (menu == 0) {
				break;
			}
			switch (menu) {
			case 1 : registerStudent(list); break;
			case 2 : searchStudent(list); break;
			case 3 : deleteStudent(list); break;
			case 4 : printAllStudent(list); break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
