package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {

	// 게시물 번호를 매개변수로 전달받아 해당 게시물의 조회수 증가를 위한 메소드
	public void updateHit(int no) {
		String sql = "update board set hit = hit + 1 where no = ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 게시물 수정을 위한 메소드
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title = ?, content = ?, fname = ? where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
	
	// 게시물번호와 암호를 매개변수로 전달받아 해당 게시물을 삭제하는 메소드
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no = ? and pwd = ?";
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
	
	// 파일명을 매개변수로 전달받아 이미지 파일인지 판별하는 메소드
	public boolean isImage(String fname) {
		boolean re = false;

		if (fname != null) {
			fname = fname.toLowerCase();
			String[] arr = { ".jpg", ".jpeg", ".png", ".gif", ".bmp" };
			for (int i = 0; i < arr.length; i++) {
				if (fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}

	// 게시물 번호를 매개변수로 전달받아 해당 게시물의 정보를 vo에 담아 반환하는 메소드
	public BoardVo getBoard(int no) {
		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setPwd(rs.getString("pwd"));
				b.setHit(rs.getInt("hit"));
				b.setContent(rs.getString("content"));
				b.setRegdate(rs.getDate("regdate"));
				b.setFname(rs.getString("fname"));
				b.setIp(rs.getString("ip"));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}

	public int insertBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "insert into board values(seq_board.nextval, ?, ?, ?, 0, sysdate, ?, ?, ?)";
			// 물음표가 나온 순서대로 값을 만든다.

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getWriter());
			pstmt.setString(3, b.getPwd());
			pstmt.setString(4, b.getContent());
			pstmt.setString(5, b.getFname());
			pstmt.setString(6, b.getIp());			
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public ArrayList<BoardVo> listAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select * from board order by no desc";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// 글번호, 글제목, 작성자, 조회수, 등록일
			while (rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setHit(rs.getInt("hit"));
				b.setRegdate(rs.getDate("regdate"));
				b.setIp("ip");
				list.add(b);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

}
