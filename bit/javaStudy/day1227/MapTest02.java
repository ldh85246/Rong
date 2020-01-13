// map의 key는 중복되지 않는다.

import java.util.HashMap;

class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Integer re1 = map.put("hello", 1);
		System.out.println(re1);
		map.put("java", 1);
		System.out.println(map);
		Integer re = map.put("hello", 2);
		System.out.println(map);
		System.out.println(re);
	}
}
