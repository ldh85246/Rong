package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BookVo;

public class BookDao {
	
	public ArrayList<BookVo> listAll() {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		try {
			String sql = "select * from book order by bookid";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
