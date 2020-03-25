package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BookVo;

public class DBManager {
	private static SqlSessionFactory factory;
	
	static {	// 객체없이 사용이 가능함, 서버에서 실행시 가장 먼저 실행됨
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<BookVo> listBook() {
		SqlSession session = factory.openSession();
		List<BookVo> list = session.selectList("book.selectAll");
		session.close();
		return list;
	}
	
	public static BookVo getBook(int bookid) {
		SqlSession session = factory.openSession();
		BookVo b = session.selectOne("book.detail", bookid);
		session.close();
		return b;
	}
	
	public static int insertBook(BookVo b) {
		SqlSession session = factory.openSession(true);
		int re = -1;
		re = session.insert("book.insert", b);
		session.close();
		return re;
	}
	
	public static int deleteBook(int bookid) {
		SqlSession session = factory.openSession(true);
		int re = -1;
		re = session.delete("book.delete", bookid);
		session.close();
		return re;
	}
}
