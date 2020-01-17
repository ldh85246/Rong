class ProcessScore {
	public ProcessScore(int[] score) {
		int tot = 0;
		for (int s : score) {
			tot += s;
		}
		int avg = tot / score.length;
		System.out.println("Æò±Õ Á¡¼ö´Â : " + avg);
	}
}

class ProcessScoreTest {
	public static void main(String[] args) {
		int[] arr = {80, 90, 90, 100, 70};
		// ProcessScore ps = new ProcessScore(arr);
		new ProcessScore(arr);
	}
}
