package com.bit.test;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		TreeSet lotto = new TreeSet();
		/* 로또 번호는 중복이 되지 않아야 하므로 set을 생성한다.
			set의 특징의 중복을 허용하지 않기 때문에
			새로운 데이터를 추가할 때 이미 그 값이 set에 있다면 담지 않는다.
		 */
		Random r = new Random();
		// 1~45 사이의 무작위 수(난수)를 만들기 위한 Random객체를 생성한다.
		
		while (true) {	// 계속(끝없이) 반복 실행한다.
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() >= 6) {	// 만약에 set이름인 lotto에 담긴 수가 6개 이상이면
				break;					// 반복문을 탈출한다.
			}
		}
		System.out.println(lotto); // set의 변수인 lotto에 담긴 6개의 숫자를 출력한다.
								   // TreeSet에 toString()이 자신에게 맞도록 재정의 되어 있다.
	}
}
