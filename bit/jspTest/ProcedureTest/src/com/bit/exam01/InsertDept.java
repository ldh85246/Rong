package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.bit.db.ConnectionProvider;

public class InsertDept {

	public static void main(String[] args) {
		try {
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call insertDept(900, '∞≥πﬂ3∆¿', '¡¶¡÷'}");
			int re = cstmt.executeUpdate();
			System.out.println("re : " + re);
			ConnectionProvider.close(null, cstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
