package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CenterVo;

public class CenterDao {
	public ArrayList<CenterVo> listAll() {
		ArrayList<CenterVo> list = new ArrayList<CenterVo>();
		try {
			String sql = "select * from center order by center_no";
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new CenterVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertCenter(CenterVo c) {
		int re = -1;
		String sql = "insert into Center values(?, ?, ?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getCenter_no());
			pstmt.setString(2, c.getC_name());
			pstmt.setString(3, c.getC_tel());
			pstmt.setString(4, c.getC_addr());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
