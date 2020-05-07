package com.bit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	public int insertBook() {
		System.out.println("도서를 등록하였습니다.");
		return 1;
	}
}
