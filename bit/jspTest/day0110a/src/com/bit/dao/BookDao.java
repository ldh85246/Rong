package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bit.vo.BookVo;

public class BookDao {
	public ArrayList<BookVo> listBookByName(String name) {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		String sql = "select bookname from book b, customer c, orders o " + 
				"where b.bookid = o.bookid and " + 
				"c.custid = o.custid and " + 
				"name = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "c##madang", "madang");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVo b = new BookVo();
				b.setBookname(rs.getString(1));
				list.add(b);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
		return list;
	}
}
