import java.util.Random;
class AutoLotto {
	public static void main(String[] args) {
		Random r = new Random();
		int []a = new int[6];

		for (int i = 0; i < a.length; ) {
			int n = r.nextInt(45) + 1;

			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (n == a[j]) {
					flag = true;
					}
				}
			if (flag == true) {
				continue;
			}
			a[i] = n;
			i++;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		System.out.println("*** 이번주 로또 추천 번호 ***");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
