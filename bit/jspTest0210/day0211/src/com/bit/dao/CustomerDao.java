package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CustomerVo;

public class CustomerDao {
	public ArrayList<CustomerVo> listAll() {
		ArrayList<CustomerVo> list = new ArrayList<CustomerVo>();
		try {
			String sql = "select * from customer order by custid";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
