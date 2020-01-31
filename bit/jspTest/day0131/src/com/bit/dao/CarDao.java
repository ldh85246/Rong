package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.CarVo;

public class CarDao {
	public int insertCar(CarVo c) {
		int re = -1;
		String sql = "insert into car values(?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getCar_no());
			pstmt.setString(2, c.getCar_type());
			pstmt.setString(3, c.getColor());
			pstmt.setInt(4, c.getSeats());
			pstmt.setInt(5, c.getRent_fee());
			pstmt.setString(6, c.getFname());
			pstmt.setInt(7, c.getC_no());
			pstmt.setInt(8, c.getT_no());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int insertOptions(int car_no, int o_no) {
		int re = -1;
		String sql = "insert into options values(?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, car_no);
			pstmt.setInt(2, o_no);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
