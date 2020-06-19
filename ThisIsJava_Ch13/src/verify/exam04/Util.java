package verify.exam04;

public class Util {

	// 방법 1
//	public static <K, V> V getValue(Pair<K, V> pair, K key) {
//		// getValue() 메소드는 첫번째 매개변수의 타입은 Pair 클래스 타입이므로 매개변수 타입을 Pair로 선언함.
//		// 첫번째 매개변수 타입으로 Pair 클래스의 자식 클래스인 ChildPair 클래스 또한 올 수 있음.
//		// Pair 클래스는 제네릭 타입을 가지므로 제네릭 타입 K, V를 선언해줌.
//		// 매개변수 타입을 제네릭 타입으로 선언했으므로 타입 파라미터도 제네릭 타입으로 선언해줌.
//		// 메소드의 리턴값은 Pair 객체의 value를 받아야 하므로 제네릭 타입 V로 선언.
//		// 매개변수의 두번째 타입은 Pair 객체의 key와 비교를 해야 하므로 동일한 타입인 제네릭 타입 K 선언.
//
//		if (pair.getKey() == key) {
//			return pair.getValue();
//		} else {
//			return null;
//		}
//	}

	// 방법 2
	public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
		// <P extends Pair<K, V> : 타입 파라미터 P는 Pair 클래스 또는 그 자식 클래스만 P 자리에 올 수 있다.
		// == 첫번째 매개변수 타입으로 Pair 클래스 또는 그 자식 클래스만 P 자리에 올 수 있다.
		// <P extends Pair<K, V> 뒤에 있는 K, V : <P extends Pair<K, V>의 K와 V를 정의하는 타입 파라미터.
		// K는 두번째 매개변수의 타입을 정의하기도 함.

		if (pair.getKey() == key) {
			return pair.getValue();
		} else {
			return null;
		}
	}

}
