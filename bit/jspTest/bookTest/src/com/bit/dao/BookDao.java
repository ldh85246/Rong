package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;

public class BookDao {
	public ArrayList<String> listBookExpensive() {
		ArrayList<String> list = new ArrayList<String>();
		String sql = "select bookname from book b1 "
				+ "where price > (select avg(price) from book b2 where b1.publisher = b2.publisher)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(rs.getString(1));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
