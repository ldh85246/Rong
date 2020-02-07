package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.GoodsVo;

public class GoodsDao {
	public int insertGoods(GoodsVo g) {
		int re = -1;
		String sql = "insert into goods values(create sequence seq_board;, ?, ?, ?, ?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getItem());
			pstmt.setInt(2, g.getPrice());
			pstmt.setInt(3, g.getQty());
			pstmt.setString(4, g.getFname());
			pstmt.setString(5, g.getDetail());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public ArrayList<GoodsVo> listAll() {
		ArrayList<GoodsVo> list = new ArrayList<GoodsVo>();
		try {
			String sql = "select * from goods order by no desc";
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new GoodsVo(rs.getInt("no"), rs.getString("item"), rs.getInt("price"), rs.getInt("qty"),
						rs.getString("fname"), rs.getString("detail")));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public GoodsVo getGoods(int no) {
		GoodsVo g = new GoodsVo();
		try {
			String sql = "select * from goods where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				g.setNo(rs.getInt(no));
				g.setItem(rs.getString("item"));
				g.setPrice(rs.getInt("price"));
				g.setQty(rs.getInt("qty"));
				g.setFname(rs.getString("fname"));
				g.setDetail(rs.getString("detail"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return g;
	}

	public int updateGoods(GoodsVo g) {
		int re = -1;
		String sql = "update into goods set item = ?, price = ?, qty = ?, fname = ?, detail = ? where no = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getItem());
			pstmt.setInt(2, g.getPrice());
			pstmt.setInt(3, g.getQty());
			pstmt.setString(4, g.getFname());
			pstmt.setString(5, g.getDetail());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int deleteGoods(int no) {
		int re = -1;
		String sql = "delete goods where no = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
