package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

import com.bit.vo.BookVo;

public class BookManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static List<BookVo> listAll() {
		SqlSession session = factory.openSession();
		List<BookVo> list = session.selectList("book.selectAll");
		session.close();
		return list;
	}

	public static BookVo getBook(int bookid) {
		SqlSession session = factory.openSession();
		BookVo b = session.selectOne("book.getBook", bookid);
		session.close();
		return b;
	}

	public static int insertBook(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("book.insert", b);
		session.close();
		return re;
	}

	public static int updateBook(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("book.update", b);
		session.close();
		return re;
	}

	public static int deleteBook(int bookid) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("book.delete", bookid);
		session.close();
		return re;
	}
}