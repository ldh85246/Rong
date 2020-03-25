package com.example.demo.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BoardVo;

public class BoardManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static List<BoardVo> listAll(HashMap map) {
		SqlSession session = factory.openSession();
		List<BoardVo> list = session.selectList("board.selectAll", map);
		session.close();
		return list;
	}

	public static int insertBoard(BoardVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("board.insert", b);
		return re;
	}

	public static int updateBoard(BoardVo b) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.update("board.update", b);
		session.close();
		return re;
	}

	public static BoardVo getBoard(int no) {
		SqlSession session = factory.openSession();
		BoardVo b = session.selectOne("board.selectBoard", no);
		session.close();
		return b;
	}

	public static int deleteBoard(HashMap map) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("board.delete", map);
		session.close();
		return re;
	}

	public static int nextNo() {
		SqlSession session = factory.openSession();
		int re = session.selectOne("board.nextNo");
		session.close();
		return re;
	}

	public static void updateStep(HashMap map) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.update("board.updateStep", map);
		session.close();
	}

	public static int totalRecord() {
		SqlSession session = factory.openSession();
		int re = session.selectOne("board.totalRecord");
		session.close();
		return re;
	}

	public static void updateHit(int no) {
		SqlSession session = factory.openSession(true);
		session.update("board.updateHit", no);
		session.close();
	}
}
