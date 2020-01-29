package com.bit.exam01;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.bit.db.ConnectionProvider;

import oracle.jdbc.OracleTypes;

/*
create or replace procedure bookInfo(
p_bookid in number,
p_bookname out varchar2,
p_price out number)
 */
public class BookInfo {
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionProvider.getConnection();
			CallableStatement cstmt = conn.prepareCall("{call bookinfo(?, ?, ?)}");
			int bookid = 8;
			String bookname = null;
			int price = 0;
			cstmt.setInt(1, bookid);
			// 첫번째 ?에 2를 설정해요.
			// 도서번호를 2로 설정해요.

			cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
			// 2번째 ?의 자료형을 문자열로 설정해요.
			// 우리가 만든 프로시저의 2번째는 출력용 변수이며 매개변수로 전달받은 도서번호에
			// 해당하는 도서명을 찾아 두번째 매개변수에 담아서 반환하는 프로시저입니다.
			// 그 두번째 매개변수의 자료형을 설정하는 것 입니다.
			// 오라클자료형 varchar2를 설정합니다.

			cstmt.registerOutParameter(3, OracleTypes.NUMERIC);
			// 3번째 ?의 자료형을 숫자로 설정합니다.
			// 해당도서의 가격을 검색하여 담도록 프로시저가 만들어져 있습니다.

			cstmt.execute();
			bookname = cstmt.getString(2);
			price = cstmt.getInt(3);
			System.out.println("도서명 : " + bookname);
			System.out.println("가격 : " + price);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
