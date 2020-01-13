import java.util.Scanner;

class Hw02 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("x의 값 : ");
	int x = scan.nextInt();

	System.out.println("y의 값 : ");
	int y = scan.nextInt();

	System.out.println("z의 값 : ");
	int z = scan.nextInt();

	int sum = x + y + z;

	System.out.println("1. x를 y로 나눈 나머지를 z에 더한 값 : ");
	System.out.println((y % x) + z);

	System.out.println("2. x와 y의 합을 x와 y의 곱으로 나누어 z에 대입한 수 : ");
	z = (x * y) / (x + y);
	System.out.println(z);

	z = (x + y);
	x += 1;
	System.out.println("3. x와 y의 합을 z에 대입하고 연산이 끝나면 x를 1만큼 증가시킨 값 : " + z + ", " + x);

	x -= 1;
	System.out.println("4. x를 1 감소시킨 후 변수 sum에서 x를 뺀 값 : " + (sum - x));

	sum = sum + x;
	x += 1;
	System.out.println("5. x를 sum에 더한 후 x의 값을 1 증가시킨 값 : " + sum +  ", " + x);
	}
}