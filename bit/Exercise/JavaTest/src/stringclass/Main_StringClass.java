package stringclass;

public class Main_StringClass {

	public static void main(String[] args) {
		System.out.println("===== String =====");
//		String str = "Hello";
		String str = new String("Hello");
		System.out.println("str : " + str);
		str = str + "World";
		System.out.println("str : " + str);
		
		// StringBuffer
		System.out.printf("\n===== StringBuffer =====\n");
		StringBuffer sf = new StringBuffer("Hello");
		System.out.println("sf : " + sf);
		sf.append("World");
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length() + "	// 문자열의 길이 출력");
		sf.insert(sf.length(), "!!");
		System.out.println("sf : " + sf);
		sf.insert(5, " ");
		System.out.println("sf : " + sf);
		sf.delete(4, 6);
		System.out.println("sf : " + sf);
		
		// StringBuilder
		System.out.printf("\n===== StringBuilder =====\n");
		StringBuilder sb = new StringBuilder("Hello JAVA!!");
		System.out.println("sb  : " + sb);
	}
}
