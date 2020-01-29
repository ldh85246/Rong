package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.bit.db.ConnectionProvider;

public class InsertDept02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dno;
		String dname, dloc;

		System.out.println("*** 새로운 부서 등록 ***");
		System.out.print("부서번호 ==> ");
		dno = sc.nextInt();
		System.out.print("부서이름 ==> ");
		dname = sc.next();
		System.out.print("부서위치 ==> ");
		dloc = sc.next();

		try {
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call insertDept(?, ?, ?)}");
			cstmt.setInt(1, dno);
			cstmt.setString(2, dname);
			cstmt.setString(3, dloc);
			int re = cstmt.executeUpdate();
			System.out.println("re : " + re);
			ConnectionProvider.close(null, cstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
