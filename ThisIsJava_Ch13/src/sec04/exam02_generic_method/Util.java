package sec04.exam02_generic_method;

// 제네릭 메소드
public class Util {

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		// 매개변수 p1, p2는 멀티 타입을 가짐, int p1, String p1....

		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// p1의 key와 p2의 key를 비교
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		// p1의 value와 p2의 value를 비교
		return keyCompare && valueCompare;
	}
}
