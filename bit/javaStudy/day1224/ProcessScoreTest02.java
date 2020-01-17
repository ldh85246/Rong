class IllegalScoreException extends Exception {
	public IllegalScoreException(String msg) {
		super(msg);
	}
}

class ProcessScore {
	public ProcessScore(int[] score) throws IllegalScoreException {
		int tot = 0;
		for (int s : score) {
			if (s < 0) {
				throw new IllegalScoreException("점수에 음수가 포함되어 있습니다.");
			}
			tot += s;
		}
		int avg = tot / score.length;
		System.out.println("평균 점수는 : " + avg);
	}
}

class ProcessScoreTest02 {
	public static void main(String[] args) {
		try {
		int[] arr = {80, 90, 90, 100, 70};
		// ProcessScore ps = new ProcessScore(arr);
		new ProcessScore(arr);
		} catch (IllegalScoreException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}
}
