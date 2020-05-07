package com.bit.dao;

import com.bit.util.LogDB;
import com.bit.util.LogFile;

public class MemberDao {
	public int insertMember(String name) {
		long start = System.currentTimeMillis();
		System.out.println(name + "의 정보를 등록하였습니다.");
		long end = System.currentTimeMillis();
		LogDB ld = new LogDB();
		ld.write("insertMember", start, end);
		return 1;
	}
	
	public int updateMember(String name) {
		long start = System.currentTimeMillis();
		System.out.println(name + "의 정보를 등록하였습니다.");
		long end = System.currentTimeMillis();
		LogDB ld = new LogDB();
		ld.write("updateMember", start, end);
		return 1;
	}
}
