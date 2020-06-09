class PairClass<K, V> {
	private K key;
	private V value;
	public PairClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void display() {
		System.out.println("key = " + key + ", value = " + value);
	}
}
public class MultipleGenericTypeTest {
	public static void main(String[] ar) {
		PairClass<Integer, String> pc_01 = new PairClass<>(1, "소원");
									// == new PairClass<Integer, String>(1, "소원"); <> 생략 가능.
		PairClass<String, Double> pc_02 = new PairClass<>("pi", 3.141592);
		
		pc_01.display();
		pc_02.display();
		
	}
}
