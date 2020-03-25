package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BookVo;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.GoodsVo;
import com.example.demo.vo.MemberVo;

public class DBManager {
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

	public static List<GoodsVo> listAll() {
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}

	public static int insertCart(CartVo cart) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("cart.insert", cart);
		session.commit();
		session.close();
		return re;
	}

	public static MemberVo isMember(MemberVo m) {
		MemberVo r = null;
		SqlSession session = factory.openSession();
		r = session.selectOne("member.isMember", m);
		session.close();
		return r;
	}

	public static List<BookVo> listBook() {
		SqlSession session = factory.openSession();
		List<BookVo> list = session.selectList("book.selectAll");
		session.close();
		return list;
	}

	public static int insertBook(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("book.insert", b);
		session.commit();
		session.close();
		return re;
	}

	public static int updateBook(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.update("book.update", b);
		session.commit();
		session.close();
		return re;
	}

	public static int deleteBook(BookVo b) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.delete("book.delete", b);
		session.commit();
		session.close();
		return re;
	}
}
