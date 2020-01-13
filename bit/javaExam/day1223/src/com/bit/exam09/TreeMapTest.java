package com.bit.exam09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("name", "È«±æµ¿");
		map.put("addr", "¼­¿ï");
		map.put("tel", "111");
		
		System.out.println(map);
	}
}
