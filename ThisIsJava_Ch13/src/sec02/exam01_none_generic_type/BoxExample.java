package sec02.exam01_none_generic_type;

// 비제네릭 타입 이용
public class BoxExample {
	public static void main(String[] ar) {
		Box box = new Box();
		box.setObject("홍길동");	// String -> Object (자동 타입 변환)
		String name = (String)box.getObject();	// Object -> String (강제 타입 변환)
		
		box.setObject(new Apple());	// Apple -> Object (자동 타입 변환)
		Apple apple = (Apple)box.getObject();	// Object -> Apple (강제 타입 변환)
	}
}
