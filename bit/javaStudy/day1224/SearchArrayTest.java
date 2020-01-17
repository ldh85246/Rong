class NotFoundException extends Exception {
	public NotFoundException(String msg) {
		super(msg);
	}
}

class SearchArray {
	public static int search(int[] arr, int value) throws NotFoundException {
		int idx = -1; // 배열의 index의 해당하는 값이 없다고 표현할 때는 보통 -1을 많이 사용한다.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			throw new NotFoundException("찾고자 하는 요소가 배열에서 확인되지 않습니다.");
		}
		return idx;
	}
}

class SearchArrayTest {
	public static void main(String[] args) {
		try {
		int[] a = {16, 18, 29, 33, 36, 39};
		// int n = SearchArray.search(a, 33);
		int n = SearchArray.search(a, 2);
		System.out.println(n + "번째에 있습니다.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
