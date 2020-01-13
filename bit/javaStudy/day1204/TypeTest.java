class TypeTest {
	public static void main(String[] args) {
	short i = 56; // 정수의 기본형인 int를 short으로 변환은 가능

	// float j = 56.7; // 실수의 기본형인 double을 float으로 변환은 불가
	float j = (float)56.7; //float j = 56.7f;

	System.out.println(i);
	System.out.println(j);
	}
}
