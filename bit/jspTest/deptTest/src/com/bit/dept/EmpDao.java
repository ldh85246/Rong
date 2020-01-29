package com.bit.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
	public ArrayList<EmpVo> listAll() {
		ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		try {
			String sql = "select * from c##madang.emp300";
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new EmpVo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
			ConnectionProvider.close(rs, stmt, conn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertEmp(EmpVo e) {
		int re = -1;
		try {
			String sql = "insert into c##madang.emp300 values(?, ?, ?, ?)";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEno());
			pstmt.setString(2, e.getEname());
			pstmt.setInt(3, e.getSal());
			pstmt.setInt(4, e.getDno());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return re;
	}

//	// 만들어보장
//	public int updateEmp(EmpVo e) {
//		int re = -1;
//		try {
//			String sql = "update c##madang.emp300 set ";
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//		return re;
//	}
}
