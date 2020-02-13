package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BookVo;

public class BookDao {
	// 모든 도서목록을 반환하는 메소드를 정의
	public ArrayList<BookVo> listAll() {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		try {
			String sql = "select * from book";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}

			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	/*
	 * public ArrayList<BookVo> listAll(String sortField, String keyword, String
	 * searchField){ ArrayList<BookVo> list = new ArrayList<BookVo>(); try { String
	 * sql = "select * from book";
	 * 
	 * if(keyword != null) { if(searchField.equals("bookid")) { sql = sql +
	 * " where bookid = " + keyword; }else { sql = sql +
	 * " where "+searchField+" like '%"+keyword+"%'"; } }
	 * 
	 * if(sortField != null) { sql = sql + " order by "+sortField; }
	 * 
	 * Connection conn = ConnectionProvider.getConnection(); Statement stmt =
	 * conn.createStatement(); ResultSet rs = stmt.executeQuery(sql);
	 * while(rs.next()) { list.add(new BookVo(rs.getInt(1), rs.getString(2),
	 * rs.getString(3), rs.getInt(4))); }
	 * 
	 * ConnectionProvider.close(rs, stmt, conn); }catch (Exception e) { // TODO:
	 * handle exception System.out.println(e.getMessage()); } return list; }
	 */
//	public ArrayList<BookVo> listRecommend(String name) {
//		ArrayList<BookVo> list = new ArrayList<BookVo>();
//		String sql = "select bookid, bookname, publisher, price" + "  from book" + " where bookid in(select bookid"
//				+ "                  from orders" + "                 where custid in (select custid"
//				+ "                                    from (select rownum n, custid, cnt"
//				+ "                                            from (select c.custid, count(*) cnt "
//				+ "                                                    from customer c, orders o, "
//				+ "                                                          (select bookid from orders where custid = (select custid from customer where name = ?)) list"
//				+ "                                                   where c.custid = o.custid"
//				+ "                                                         and o.bookid = list.bookid"
//				+ "                                                         and c.name != ?"
//				+ "                                                   group by c.custid"
//				+ "                                                   order by count(*) desc"
//				+ "                                                  )" + "                                          )"
//				+ "                                   where cnt >= (select cnt"
//				+ "                                                  from (select rownum n, custid, cnt"
//				+ "                                                          from (select c.custid, count(*) cnt "
//				+ "                                                                  from customer c, orders o, "
//				+ "                                                                        (select bookid from orders where custid = (select custid from customer where name = ?)) list"
//				+ "                                                                 where c.custid = o.custid"
//				+ "                                                                       and o.bookid = list.bookid"
//				+ "                                                                       and c.name != ?"
//				+ "                                                                 group by c.custid"
//				+ "                                                                 order by count(*) desc"
//				+ "                                                                )"
//				+ "                                                       )"
//				+ "                                                  where n = 2"
//				+ "                                                  )" + "                                )"
//				+ "                minus" + "                select bookid" + "                  from orders"
//				+ "                 where custid = (select custid" + "                               from customer"
//				+ "                               where name = ?)" + "                )";
//		try {
//
//			Connection conn = ConnectionProvider.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setString(2, name);
//			pstmt.setString(3, name);
//			pstmt.setString(4, name);
//			pstmt.setString(5, name);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				list.add(new BookVo(rs.getInt("bookid"), rs.getString("bookname"), rs.getString("publisher"),
//						rs.getInt("price")));
//			}
//
//			if (list.size() == 0) {
//				list = listBest3();
//			}
//			ConnectionProvider.close(rs, pstmt, conn);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return list;
//	}
//
//	private ArrayList<BookVo> listBest3() {
//		ArrayList<BookVo> list = new ArrayList<BookVo>();
//
//		return list;
//	}

	// 새로운 도서 등록을 위한 웹어플리케이션을 작성해봅니다.
	public int insertBook(BookVo b) {
		int re = -1;
		try {
			String sql = "insert into book values(?, ?, ?, ?)";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getBookid());
			pstmt.setString(2, b.getBookname());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int updateBook(BookVo b) {
		int re = -1;
		try {
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBookname());
			pstmt.setString(2, b.getPublisher());
			pstmt.setInt(3, b.getPrice());
			pstmt.setInt(4, b.getBookid());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public int deleteBook(int bookid) {
		int re = -1;
		try {
			String sql = "delete book where bookid = ?";
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(null, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}

	public BookVo getBook(int bookid) {
		BookVo b = new BookVo();
		String sql = "select * from book where bookid = ?";
		try {
			Connection conn = ConnectionProvider.getConnection("c##bit1234", "bit1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setPublisher(rs.getString(3));
				b.setPrice(rs.getInt(4));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return b;
	}
}
