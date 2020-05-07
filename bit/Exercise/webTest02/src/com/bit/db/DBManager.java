package com.bit.db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.DeptVo;

public class DBManager {
	public static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("/com/bit/db/sqlMapConfig.xml");
			factory = (new SqlSessionFactoryBuilder()).build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static int insertDept(DeptVo d) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("dept.insert", d);
		session.commit();
		session.close();
		return re;
	}

}
