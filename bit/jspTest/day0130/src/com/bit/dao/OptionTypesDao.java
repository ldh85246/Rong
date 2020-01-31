package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.OptionTypesVo;

public class OptionTypesDao {
	public ArrayList<OptionTypesVo> listAll() {
		ArrayList<OptionTypesVo> list = new ArrayList<OptionTypesVo>();
		String sql = "select * from option_types";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new OptionTypesVo(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
