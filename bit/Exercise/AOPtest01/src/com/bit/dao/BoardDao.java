package com.bit.dao;

import com.bit.util.LogDB;
import com.bit.util.LogFile;

public class BoardDao {
	public int deleteBoard(int no) {
		long start = System.currentTimeMillis();
		System.out.println(no + "번의 게시물을 삭제하였습니다.");
		
		long end = System.currentTimeMillis();
		LogDB ld = new LogDB();
		ld.write("deleteBoard", start, end);
		return 1;
	}
}
