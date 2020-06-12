package sec02.exam02_generic_type;

// 제네릭 타입
public class Box<T> {
	// <T> : 제네릭을 사용하겠다는 선언. 어떤 타입인지는 미정. 보통 알파벳 대문자 한 글자로 표기.
	// 클래스를 이용할 때 (객체 생성, 생성자 선언 등) 제네릭의 타입을 설정함. 
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}