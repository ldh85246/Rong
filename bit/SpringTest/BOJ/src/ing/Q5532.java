package ing;

import java.util.Scanner;

/**
 * 1. 국어숙제는 몇일만에 끝내는가?
 * 2. 수학숙제는 몇일만에 끝내는가?
 * 3. 1번과 2번을 비교해서 큰 수를 리턴
 * 4. 총 방학일수 - * 3번
 * @author quadcore
 */
public class Q5532 {
	Scanner sc = new Scanner(System.in);
	public static int l, a, b, c, d, result;

	public static void main(String[] args) {
		int vacation = l;
		int korDay = koreanDay(a, c);
		int mathDay = mathDay(b, d);
		result = compare(korDay, mathDay);
		// 4. 총 방학일수 - 3번
		System.out.println(vacation - result);
	}

	// 1. 국어숙제는 몇일만에 끝내는가?
	public static int koreanDay(int mountOfKor, int dayOfKor) {
		if (mountOfKor % dayOfKor == 0) {
			mountOfKor = mountOfKor / dayOfKor;
		} else {
			mountOfKor = mountOfKor / dayOfKor + 1;
		}
		return a;
	}

	// 2. 수학숙제는 몇일만에 끝내는가?
	public static int mathDay(int mountOfMath, int dayOfMath) {
		if (mountOfMath % dayOfMath == 0) {
			mountOfMath = mountOfMath / dayOfMath;
		} else {
			mountOfMath = mountOfMath / dayOfMath + 1;
		}
		return b;
	}

	// 1번과 2번을 비교해서 큰 수를 리턴
	public static int compare(int korDay, int mathDay) {
		if (mathDay > korDay) {
			System.out.println(l - a);
		} else {
			System.out.println(l - b);
		}
		return result;
	}
}
