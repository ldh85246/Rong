/*
5행 5열의 2차원 배열을 만들고,
각 배열의 요소에 1부터 1씩 증가한 값을 차례로 대입한 후 출력
*/

class MatixTest {
	public static void main(String[] args) {
		int [][]a = new int[5][5];
		int n = 1;

		for (int i = 0; i < a.length /* 행의 수를 알려줌 */; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = n++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
