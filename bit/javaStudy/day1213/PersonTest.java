/*
사람 Person
	속성
		이름	String name;	"이수인"
		성별	String gender;	"여자"
		나이	int age;	20

	동작
		먹는다	void eat(String food)
		잔다	void sleep()
*/

class Person {
	String name;
	String gender;
	int age;

	void eat(String food) {
		System.out.println("성별이 " + gender + "이고, 나이가 " + age + "살인 " + name + "이(가) " + food + "을(를) 먹어요.");
	}

	void sleep() {
		System.out.println(name + "이(가) 쿨쿨 자요.");
	}
}

class PersonTest {
	public static void main(String[] args) {
		Person p/*p = 객체참조변수*/ = new Person();
		p./*. = 멤버접근지정자*/name = "최영수";
		p.age = 28;
		p.gender = "남자";
		p.eat("피자");
		p.sleep();
	}
}
