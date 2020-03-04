
/**
 * 1. 국어숙제는 몇일만에 끝내는가?
 * 2. 수학숙제는 몇일만에 끝내는가?
 * 3. 1번과 2번을 비교해서 큰 수를 리턴
 * 4. 총 방학일수 - 3번 
 * @author quadcore
 */
public class Main {
	
	public static void main(String[] args) {
		int vacation;
		int korDay = koreanDay(mountOfKor, dayOfKor);
		int mathDay = mathDay(mountOfMath, dayOfMath);
		int result = compare(korDay, mathDay);
		// 4. 총 방학일수 - 3번 
		System.out.println(vacation - result);
	}
	
//	1. 국어숙제는 몇일만에 끝내는가?
	public static int koreanDay(int mountOfKor, int dayOfKor) {
		
		return 0;
	}
// 2. 수학숙제는 몇일만에 끝내는가?
	public static int mathDay(int mountOfMath, int dayOfMath) {
		
		return 0;
	}
	// 1번과 2번을 비교해서 큰 수를 리턴
	public static int compare(int korDay, int mathDay) {
		
		return 0;
	}
}

