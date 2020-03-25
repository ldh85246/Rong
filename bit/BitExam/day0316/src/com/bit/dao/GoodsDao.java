package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.vo.GoodsVo;

public class GoodsDao {
	public ArrayList<GoodsVo> listAll() {
		ArrayList<GoodsVo> list = new ArrayList<GoodsVo>();
		try {
			String sql = "select * from goods";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(	// db를 연결하는 권한
					"jdbc:oracle:thin:@myoracle-dotori.cfa5yvw4d93j.ap-northeast-2.rds.amazonaws.com:1521/ORCL",
					"ADMIN", "password");
			Statement stmt = conn.createStatement();		// 연결된 db에서 명령을 할 수 있는 권한
			ResultSet rs = stmt.executeQuery(sql);			// 실행한 쿼리를 결과값에 담아준다.
			while (rs.next()) {
				list.add(new GoodsVo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6)));
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