import java.util.TreeSet;
import java.util.Random;

class AutoLottoSet {
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		Random r = new Random();

		while(hs.size() < 6) { // 계속 돌아 라는 제어문
			hs.add(r.nextInt(45) + 1);
			/*
			if (hs.size() == 6) {
				break;
			}
			*/
		}
		System.out.println("*** 이번주 로또 추첨번호 ***");
		System.out.print(hs);
	}
}
