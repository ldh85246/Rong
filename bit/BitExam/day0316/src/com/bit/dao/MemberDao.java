package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.MemberVo;

public class MemberDao {
	public ArrayList<MemberVo> listAll() {
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		String sql = "select * from member";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@myoracle-dotori.cfa5yvw4d93j.ap-northeast-2.rds.amazonaws.com:1521/ORCL", "ADMIN", "password");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new MemberVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}

			if (rs != null) {
				rs.close();
			}

			if (stmt != null) {
				stmt.close();
			}

			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}
}