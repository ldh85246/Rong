package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BoardVo;

public class BoardDao {
	public static int totalRecord;			//전체 레코드수를 저장하기 위한 변수
	public static final int pageSIZE = 10;	//한 화면에 보여줄 레코드 수를 제한하기 위한 변수
	public static int totalPage;			//전체 페이지 수를 저장하기 위한 변수
	public static int pageGROUP = 5;		//한 화면에 보여줄 페이지의 수를 제한하기 위한 변수
	//새로운 글 번호를 반환하는 메소드를 정의
	public int getNextNo() {
		int re = 0;
		String sql = "select nvl(max(no), 0) + 1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				re = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	//전체 레코드 수를 반환하는 메소드를 정의
	public int getTotalRecord() {
		int n = 0;
		try {
			String sql = "select count(*) from board";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	//게시물 번호를 매개변수로 전달받아 
	//해당 게시물의 조회수 증가를 위한 메소드를 정의
	public void updateHit(int no) {
		try {
			String sql = "update board set hit = hit + 1 where no = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(4, no);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//게시물 수정을 위한 메소드
	public int updateBoard(BoardVo b) {
		int re = -1;
		try {
			String sql = "update board set title = ?, content = ?, fname = ? "
					+ "where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(2, b.getFname());
			pstmt.setInt(4, b.getNo());
			pstmt.setString(5, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	//게시물번호와 암호를 매개변수로 전달받아 해당 게시물을 삭제하는 메소드
	public int deleteBoard(int no, String pwd) {
		int re = -1;
		try {
			String sql = "delete board where no = ? and pwd = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	public boolean isImage(String fname) {
		boolean re = false;
		if(fname != null) {
			fname = fname.toLowerCase();
			String[] arr = {".jpg", ".gif", ".png", ".bmp", "jpeg"};
			for(int i = 0; i < arr.length; i++) {
				if(fname.endsWith(arr[i])) {
					re = true;
					break;
				}
			}
		}
		return re;
	}
	public BoardVo getBoard(int no) {
		BoardVo b = new BoardVo();
		try {
			String sql = "select * from board where no = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setPwd(rs.getString("pwd"));
				b.setHit(rs.getInt("hit"));
				b.setContent(rs.getString("content"));
				b.setRegdate(rs.getDate("regdate"));
				b.setFname(rs.getString("fname"));
				b.setIp(rs.getString("ip"));
				b.setB_ref(rs.getInt("b_ref"));
				b.setB_level(rs.getInt("b_level"));
				b.setB_step(rs.getInt("b_step"));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		}catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public ArrayList<BoardVo> listAll(int pageNUM){
		totalRecord = getTotalRecord();
		totalPage = totalRecord / pageSIZE;
		if(totalRecord % pageSIZE != 0) {
			totalPage++;
		}
		System.out.println("전체페이지수:"+totalPage);
		//현재 페이지에 보여줄 시작 레코드의 위치를 계산해요.
		//만약 전체 레코드가 43개이고
		//현재 페이지가 1페이지 라면
		//시작 레코드의 위치는 1
		//만약 현재 페이지가 2페이지라면 시작 레코드의 위치는 11
		int start = (pageNUM - 1) * pageSIZE + 1;
		int end = start + pageSIZE - 1;
		if(end > totalRecord) {
			end = totalRecord;
		}
		
		
		
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String sql = "select no, title, writer, pwd, hit, regdate, content, fname, ip, b_ref, b_level, b_step " + 
				"	from (select rownum n, no, title, writer, pwd, hit, regdate, content, fname, ip, b_ref, b_level, b_step " + 
				"					from (select * " + 
				"									from board" + 
				"								 order by b_ref desc, b_step)" + 
				"				)" + 
				"	where n between ? and ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVo b = new BoardVo();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setHit(rs.getInt("hit"));
				b.setRegdate(rs.getDate("regdate"));
				b.setIp(rs.getString("ip"));
				b.setB_ref(rs.getInt("b_ref"));
				b.setB_level(rs.getInt("b_level"));
				b.setB_step(rs.getInt("b_step"));
				list.add(b);
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	public int insertBoard(BoardVo b) {
		int re = -1;
		//일단은 새글이라고 보고 b_ref는 글번호와 동일하게,
		
		int no = getNextNo();
		//vo에 실린 글번호(
		int p_no = b.getNo();
		
		//b_level과 b_step은 0으로 설정한다.
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		//만약에 답글달기 인가요?
		if(p_no != 0) {
			BoardVo p = getBoard(p_no);
			b_ref = p.getB_ref();
			//부모글의 b_level과 b_step을 갖고 와요.
			b_level = p.getB_level();
			b_step = p.getB_step();
			
			//최신의 답글을 먼저 출력하기 위하여 
			//이미 달려있는 답글들의 b_step을 1씩 증가하기 위한 메소드를 호출
			updateStep(b_ref, b_step);
			b_level++;
			b_step++;
		}
		String sql = "insert into board(no, title, writer, pwd, hit, "
				+ "regdate, content, fname, ip, b_ref, "
				+ "b_level, b_step) " + 
				"values(?, ?, ?, ?, 0, "
				+ "sysdate, ?, ?, ?, ?, "
				+ "?, ?)";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			pstmt.setString(6, b.getFname());
			pstmt.setString(7, b.getIp());
			pstmt.setInt(8, b_ref);
			pstmt.setInt(9, b_level);
			pstmt.setInt(10, b_step);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
		return re;
	}
	private void updateStep(int b_ref, int b_step) {
		//내가 답글을 작성하려고 하는 부모글에
		//이미 달려 있는 답글들의 b_step을 1씩 증가시켜요.
		//내가 작성하려는 글과 b_ref가 같고
		//내가 작성하려는 글의 b_step보다 더 큰 것들.
		String sql = "update board set b_step = b_step + 1 where b_ref = ? and b_step > ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_ref);
			pstmt.setInt(2, b_step);
			pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
