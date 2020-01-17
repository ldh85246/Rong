package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {
	public ArrayList<BoardVo> listAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select * from board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BoardVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getInt(7)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertBoard(BoardVo b) {
		int re = -1;
		String sql = "insert into board values((select nvl(max(no), 0) + 1 from board), ?, ?, ?, ?, sysdate, 0";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setString(3, b.getPwd());
			pstmt.setString(4, b.getContent());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int updateBoard(BoardVo b) {
		int re = -1;
		String sql = "update board set title = ?, content = ? where no = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setInt(3, b.getNo());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int deleteBoard(int no) {
		int re = -1;
		String sql = "delete from board where no = ?";
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
