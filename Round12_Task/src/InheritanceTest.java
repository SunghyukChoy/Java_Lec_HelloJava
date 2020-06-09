class SubClass { // 상속과 관련된 예약어를 사용하지 않음.
	// 아무런 내용도 기재하지 않음
}
public class InheritanceTest {
	public static void main(String[] ar) {
		SubClass sub = new SubClass();
		System.out.println("두 객체가 같나? " + sub.equals(sub));
		System.out.println("sub 객체의 클래스는? " + sub.getClass());
		System.out.println("sub 객체의 hashCode는? " + sub.hashCode());
		System.out.println("sub 객체를 표현하는 기본 문자열은? " + sub.toString());
		System.out.println("객체를 출력하면 자동으로 toString()이 호출되나? " + sub);
	}
}
