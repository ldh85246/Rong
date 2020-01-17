package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bit.vo.CustomerByPublisherVo;
import com.bit.vo.CustomerVo;

public class CustomerDao {
	public ArrayList<CustomerByPublisherVo> listCustomerByPublisher(String publisher) {
		ArrayList<CustomerByPublisherVo> list = new ArrayList<CustomerByPublisherVo>();
		try {
			String sql = "select c.custid, name, bookname, saleprice from book b, customer c, orders o "
					+ "where b.bookid = o.bookid and " + "c.custid = o.custid and publisher = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, publisher);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new CustomerByPublisherVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	// 도서번호를 매개변수로 전달받아 해당 도서를 구매한 고객목록을 반환하는 메소드 정의

	public ArrayList<CustomerVo> listCustomerByBookid(int bookid) {
		ArrayList<CustomerVo> list = new ArrayList<CustomerVo>();
		String sql = "select c.custid, name, address, phone from book b, customer c, orders o "
				+ "where c.custid = o.custid and " + "b.bookid = o.bookid and " + "o.bookid = ?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
