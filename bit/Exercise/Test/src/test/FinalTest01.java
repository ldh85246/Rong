package test;

public class FinalTest01 {

	public static void main(String[] args) {
		AA ob = new AA();
		ob.year = 2021;
//		ob.count = 21; // final로 된 변수는 값을 변경할 수 없어요.
	}

}

class AA {
	int year = 2020;
	final static int count = 20; // 어차피 수정이 불가하여 객체 공유
}