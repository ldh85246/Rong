package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BookVo;

public class BookManager {
	private static SqlSessionFactory factory;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static List<BookVo> listAll() {
		List<BookVo> list = null;
		SqlSession session = factory.openSession();
		list = session.selectList("book.listAll");
		session.close();
		return list;
	}
	
	public static int insert(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("book.insert", b);
		session.close();
		return re;
	}

	public static int update(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.update("book.update", b);
		session.close();
		return re;
	}

	public static int delete(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("book.delete", b);
		session.close();
		return re;
	}
}
