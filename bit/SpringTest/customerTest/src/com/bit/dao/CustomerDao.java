package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp.PoolablePreparedStatement;
import org.springframework.stereotype.Repository;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CustomerVo;

@Repository
public class CustomerDao {

	public CustomerVo getCustomer(int custid) {
		CustomerVo c = null;
		try {
			String sql = "select * from customer where custid=?";
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				c = new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}

			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return c;
	}

	public ArrayList<CustomerVo> listAll() {
		ArrayList<CustomerVo> list = new ArrayList<CustomerVo>();
		String sql = "select * from customer";
		try {
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new CustomerVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertCustomer(CustomerVo c) {
		// TODO Auto-generated method stub
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			String sql = "insert into customer values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getCustid());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getAddress());
			pstmt.setString(4, c.getPhone());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int updateCustomer(CustomerVo c) {
		// TODO Auto-generated method stub
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			String sql = "update customer set name=?,address=?,phone=? where custid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getAddress());
			pstmt.setString(3, c.getPhone());
			pstmt.setInt(4, c.getCustid());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection("c##madang", "madang");
			String sql = "delete customer  where custid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return re;
	}
}
