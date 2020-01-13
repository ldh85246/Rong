package com.bit.exam01;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("name", "이수인");
		map.put("age", 20);
		map.put("addr", "서울시 마포구 신수동");
		
		ArrayList list = new ArrayList();
		list.add("이수인");
		list.add(20);
		list.add("서울시 마포구 신수동");
		
		System.out.println(map.get("name"));
		System.out.println(list.get(0));
		System.out.println(map);
		System.out.println(list);
	}
}
