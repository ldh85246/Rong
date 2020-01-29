package com.bit.dept;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDept {

	public static EmpDao dao = new EmpDao();
	public static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("1. 사원등록");
		System.out.println("2. 사원목록");
		System.out.println("0. 종료");
		System.out.print("메뉴를 선택하세요 ==> ");
	}

	public static void list() {
		ArrayList<EmpVo> list = dao.listAll();
		System.out.println("<사원번호>\t<사원명>\t<급여>\t<부서번호>");
		for (EmpVo e : list) {
			System.out.print(e.getEno() + "\t");
			System.out.print(e.getEname() + "\t");
			System.out.print(e.getSal() + "\t");
			System.out.println(e.getDno());
		}
	}

	public static void insert() {
		int eno, sal, dno;
		String ename;
		System.out.println("사원번호 ==> ");
		eno = sc.nextInt();
		System.out.println("사원이름 ==> ");
		ename = sc.next();
		System.out.println("급여 ==> ");
		sal = sc.nextInt();
		System.out.println("부서번호 ==> ");
		dno = sc.nextInt();

		EmpVo e = new EmpVo(eno, ename, sal, dno);
		int re = dao.insertEmp(e);
		String msg = "사원을 등록하였습니다.";
		if (re < 0) {
			msg = "등록에 실패하였습니다.";
		}
		System.out.println(msg);
	}

	public static void main(String[] args) {
		int cmd = 9;
		while (cmd != 0) {
			menu();
			cmd = sc.nextInt();
			switch (cmd) {
			case 1:
				insert();
				break;
			case 2:
				list();
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
