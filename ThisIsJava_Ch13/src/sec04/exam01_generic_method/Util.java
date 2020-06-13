package sec04.exam01_generic_method;

// 제네릭 메소드
public class Util {

	public static <T> Box<T> boxing(T param) {
		// 첫 번째 <T> : 타입 파라미터. 제네릭 메소드임을 선언. T를 리턴 타입과 매개변수 타입으로 사용하겠다.
		// Box<T> : 리턴타입. 제네릭으로 선언하지 않으면 Object 타입 리턴.
		// boxing(T param) : 매개변수 타입으로 제네릭 사용
		// boxing 메소드 호출 시 구체적 타입 지정
		Box<T> box = new Box<T>();
		box.setVar(param);
		return box;
	}
}