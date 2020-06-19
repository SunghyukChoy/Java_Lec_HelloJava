package verify.exam04;

// Util.getValue() 메소드는 첫번째 매개값으로 Pair 타입과 하위 타입만 받고 두번째 매개값으로 키값을 받습니다.
// 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고, 일치하지 않으면 null을 리턴하도록 getValue() 제네릭 메소드를 정의해 보세요.
public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		// getValue() 메소드는 클래스로 바로 접근했으므로 정적 메소드이다.
		// 첫번째 매개타입은 Pair 클래스 타입, 두번째 매개타입은 Pair 클래스가 갖는 제네릭 타입의 K 타입.
		// 리턴 타입은 Pair 클래스가 갖는 제네릭 타입의 V 타입.
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);

//		OtherPair<String, Integer> otherPair = new OtherPair<String, Integer>("홍삼원", 20);
//		// OtherPair는 Pair를 상송하지 않으므로 예외가 발생해야 합니다.
//		int otherAge = Util.getValue(otherPair, "홍삼원");
//		System.out.println(otherAge);

	}
}