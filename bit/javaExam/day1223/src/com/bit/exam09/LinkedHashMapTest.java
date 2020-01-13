package com.bit.exam09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "È«±æµ¿");
		map.put("addr", "¼­¿ï");
		map.put("tel", "111");
		
		System.out.println(map);
	}
}
