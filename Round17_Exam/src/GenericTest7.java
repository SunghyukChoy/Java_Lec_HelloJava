class K<T extends Number> {
		// K 클래스의 타입 파라미터를 숫자로 제한.
	T data;
	public K(T data) {
		this.data = data;
	}
	public void display() {
		System.out.println("data = " + data);
	}
}
public class GenericTest7 {
	public static void main(String[] ar) {
		K<Integer> ki = new K(10);
		ki.display();
		
//		K<String> ks = new K("은하");		// 타입 파라미터를 숫자로 제한. 문자열 대입 불가.
//		ks.display();
	}
}
