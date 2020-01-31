package com.bit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CarTypeVo;

public class CarTypeDao {
	public ArrayList<CarTypeVo> listAll() {
		ArrayList<CarTypeVo> list = new ArrayList<CarTypeVo>();
		String sql = "select * from car_type";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new CarTypeVo(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
