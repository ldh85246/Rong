import java.util.ArrayList;

class ArrayAndArrayList {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);

		a[1] = 200;
		b.set(1, 200);
	}
}
