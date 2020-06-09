class PairClass<T1, T2> {	// T1 타입, T2타입	// K, V로 선언해도 상관 없음.
	T1 key;
	T2 value;
	public PairClass(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
	public void display() {
		System.out.println(key + " : " + value);
	}
}	// 타입을 받아들여서 만들겠다.. 라는 클래스.	하나의 클래스를 활용.
public class GenericTest5 {	
	public static void main(String[] ar) {
//		PairClass pc = new PairClass("신비", 10);
//		PairClass pc2 = new PairClass(11.11, false);
//		PairClass pc3 = new PairClass('c', 1.234);
		
		PairClass<Integer, String> is = new PairClass(10, "신비");
			 	// Integer와 String을 전달하는 형태로 만들겠다.
		PairClass<Integer, Double> id = new PairClass(20, 1.234);
		
		is.display();
		id.display();
	}
}
