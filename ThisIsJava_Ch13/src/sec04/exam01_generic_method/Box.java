package sec04.exam01_generic_method;

// 제네릭 타입
public class Box<T> {
	// <T> : 제네릭을 사용하겠다는 선언. 어떤 타입인지는 미정. 보통 알파벳 대문자 한 글자로 표기.
	// 클래스를 이용할 때 (객체 생성, 생성자 선언 등) 제네릭의 타입을 설정함.

	private T var;
	// 제네릭을 사용함으로써 변수 var는 다양한 자료형을 가질 수 있음.
	// == 객체 생성 시에 선언하는 제네릭 타입에 따라 다양한 자료형의 객체 생성 가능을 뜻함.
	// private String var, private int var, private double var... 등의 선언 필요 없음.
	// Object형으로 var를 선언할 수도 있지만 변수 생성 시 캐스팅 해주어야 함.

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}