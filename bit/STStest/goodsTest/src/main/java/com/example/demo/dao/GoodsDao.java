package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.db.GoodsManager;
import com.example.demo.vo.GoodsVo;

@Repository
public class GoodsDao {
	
	public static int pageSIZE = 4;
	public static int totalRecord = 0;
	public static int totalPage = 1;
	
	public int getTotalRecord() {
		return GoodsManager.totalRecord();
	}
	
	public List<GoodsVo> listAll(HashMap map) {
		totalRecord = getTotalRecord();
		totalPage = (int) Math.ceil(totalRecord / (double)pageSIZE);
		System.out.println("전체 페이지 수 : " + totalPage);
		return GoodsManager.listAll(map);
	}
	
	public int insertGoods(GoodsVo g) {
		return GoodsManager.insertGoods(g);
	}
	
	public GoodsVo getGoods(int no) {
		return GoodsManager.getGoods(no);
	}
	
	public int updateGoods(GoodsVo g) {
		return GoodsManager.updateGoods(g);
	}
	
	public int deleteGoods(int no) {
		return GoodsManager.deleteGoods(no);
	}
}
