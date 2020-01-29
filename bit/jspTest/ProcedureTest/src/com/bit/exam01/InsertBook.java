package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.bit.db.ConnectionProvider;

public class InsertBook {
	public static void main(String[] args) {
		
		// BookInsertOrUpdate 프로시저를 호출하는 자바 프로그램을 생성
		try {
			int bookid = 13;
			String bookname = "골프천재";
			String publisher = "대한미디어";
			int price = 40000;
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call BookInsertOrUpdate(?, ?, ?, ?)}");
			cstmt.setInt(1, bookid);
			cstmt.setString(2, bookname);
			cstmt.setString(3, publisher);
			cstmt.setInt(4, price);
			int re = cstmt.executeUpdate();
			System.out.println("re : " + re);
			ConnectionProvider.close(null, cstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
