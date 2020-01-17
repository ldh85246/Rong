import java.util.HashMap;

class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hello", 2);
		map.put("java", 1);
		
//		int n = map.get("hello"); // 2로 표기
//		int n = map.get("korea"); // 예외 오류, null을 int형으로 바꾸지 못해서
		Integer n = map.get("korea"); // null로 표기
		System.out.println(n);
	}
}
