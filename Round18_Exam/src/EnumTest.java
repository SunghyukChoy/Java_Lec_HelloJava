enum MyData {
	One, Two, Three
		// One, Two, Three라는 타입 자체. 내부에서 조작하거나 다른 방향으로 사용할 수 있음.
}
class MyData2 {		// MyData와 비ㅅ
	public static final String one = "One";	// String 타입. 초기값 지정해 줌.
	public static final String two = "Two";
	public static final String three = "Three";
}
public class EnumTest {
	public static void main(String[] ar) {
		System.out.println("one = " + MyData.One);
		System.out.println("one = " + MyData2.one);
	}
}
