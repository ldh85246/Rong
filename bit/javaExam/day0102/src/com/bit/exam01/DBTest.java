package com.bit.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		String sql = "insert into student values('ÀÌ¿ø¿ì', 80, 90, 100)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit", "bit");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
