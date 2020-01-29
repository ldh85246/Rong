package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {

	// 모든 게시물을 검색하여 ArrayList로 반환하는 메소드
	public ArrayList<BoardVo> listAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select * from board order by no";
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

	// BoardVo를 매개변수로 전달받아 게시물 등록을 위한 메소드
	public int insertBoard(BoardVo b) {
		int re = -1;
		String sql = "insert into board values(?, ?, ?, ?, ?, sysdate, 0)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getNextNo());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	// 다음에 등록될 게시물의 번호를 반환하는 메소드
	// 이미 등록되어 있는 게시물번호의 가장 큰 값에 +1한 결과를 반환하는 메소드
	public int getNextNo() {
		int no = 0;
		String sql = "select nvl(max(no), 0) + 1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				no = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return no;
	}

	// 글번호를 매개변수로 전달받아 해당 게시물의 정보를 BoardVo로 반환하는 메소드
	public BoardVo getBoard(int no, boolean hitAdd) {
		if (hitAdd) {
			updateHit(no);
		}

		BoardVo b = null;
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b = new BoardVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getDate(6), rs.getInt(7));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}

	// 글번호를 매개변수로 전달받아 해당 게시물의 조회수를 1 증가하는 메소드
	// 게시물 번호가 1번인 게시물의 조회수를 1 증가
	// update board set hit = hit + 1 where no = 1;
	public int updateHit(int no) {
		int re = -1;
		try {
			String sql = "update board set hit = hit + 1 where no = ?";
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
	
	public int updateBoard(BoardVo b) {
		int re = -1;
		String sql = "update board set title = ?, content = ? where no = ? and pwd = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getNo());
			pstmt.setString(4, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	// 글번호와 암호를 매개변수로 전달받아 일치하면 게시물을 삭제하는 메소드
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		String sql = "delete from board where no = ? and pwd = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
