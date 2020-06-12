package sec02.exam02_generic_type;

// 제네릭 타입 이용
public class BoxExample {
	public static void main(String[] ar) {

		Box<String> box1 = new Box<String>();
		// Box 객체의 타입을 String으로 지정.
		box1.setT("hello");
		// String 타입만 저장 가능. 타입 변환 없음.
		String str = box1.getT();
		// 타입 변환 없음.

		Box<Integer> box2 = new Box<Integer>();
		box2.setT(10);
		int value = box2.getT();
	}
}