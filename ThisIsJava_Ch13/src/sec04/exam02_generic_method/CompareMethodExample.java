package sec04.exam02_generic_method;

// 제네릭 메소드 호출
public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		// 다이아몬드 연산자로 제네릭 타입 생략 가능.
		// 생성자로 key는 1, value는 사과를 갖는 객체 생성

		boolean result1 = Util.<Integer, String>compare(p1, p2);
		// p1과 p2는 Integer, String 타입을 갖는 객체이므로 메소드 호출 시 제네릭 타입 Integer, String 선언
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");

		boolean result2 = Util.compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}