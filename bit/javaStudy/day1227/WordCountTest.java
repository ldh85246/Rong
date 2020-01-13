import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;

class WordCountTest {
	public static void main(String[] args) {

		ArrayList<String> listWord = new ArrayList<String>();
		ArrayList<Integer> listCnt = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		String str = "Happy Merry Christmas and Happy New Year Happy Merry man Happy Merry Christmas and Happy New Year Happy Merry man Happy Merry Christmas and Happy New Year Happy Merry man Happy Merry Christmas and Happy New Year, Happy Merry man Happy Merry Christmas and Happy New Year, Happy Merry man";
//		System.out.println("문장을 입력하세요");
//		String str = sc.nextLine();

		String[] arr = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String s : arr) {
			int n = 0;
			if (map.get(s) != null) {
				n = map.get(s);
			}

			n = n + 1;
			map.put(s, n);
		}
		System.out.println(map);

		Set keySet = (Set)map.keySet(); // map으로부터 key를 모두 뽑아 온다.
		System.out.println(keySet);
		// key의 데이터 수 만큼 반복수행한다.
		// Set 자체는 반복문을 수행할 길이 없다.

		Iterator iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = (String)iter.next();
			Integer cnt = map.get(key);
//			System.out.println(key + " = " + cnt);
			listWord.add(key);
			listCnt.add(cnt);
		}

			for (int i = 0; i < listCnt.size(); i++) {
				for (int j = i + 1; j < listCnt.size(); j++) {
					if (listCnt.get(j) > listCnt.get(i)) {
						String temp = listWord.get(i);
						listWord.set(i, listWord.get(j));
						listWord.set(j, temp);

						Integer tmp = listCnt.get(i);
						listCnt.set(i, listCnt.get(j));
						listCnt.set(j, tmp);
					}
				}
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(listWord.get(i) + " = " + listCnt.get(i));
		}
	}
}
