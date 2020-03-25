package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.BoardManager;
import com.example.demo.vo.BoardVo;

@Repository
public class BoardDao {
	public List<BoardVo> listAll(HashMap map) {
		return BoardManager.listAll(map);
	}

	public BoardVo getBoard(int no) {
		return BoardManager.getBoard(no);
	}

	public int updateBoard(BoardVo b) {
		return BoardManager.updateBoard(b);
	}

	public int insertBoard(BoardVo b) {
		return BoardManager.insertBoard(b);
	}

	public int deleteBoard(HashMap map) {
		return BoardManager.deleteBoard(map);
	}

	public int nextNo() {
		return BoardManager.nextNo();
	}

	public void updateStep(HashMap map) {
		BoardManager.updateStep(map);
	}

	public void updateHit(int no) {
		BoardManager.updateHit(no);
	}

	public int totalRecord() {
		return BoardManager.totalRecord();
	}
}
