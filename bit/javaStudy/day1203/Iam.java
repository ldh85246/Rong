import java.util.Scanner;

class Iam {
	public static void main(String[] args) {
	String name;
	int age;

	Scanner sc = new Scanner(System.in);
	System.out.println("이름? ");
	name = sc.next();

	System.out.println("나이? ");
	age = sc.nextInt();

	System.out.println("이름은 " + name + "나이는 " + age + "살");
	}
}