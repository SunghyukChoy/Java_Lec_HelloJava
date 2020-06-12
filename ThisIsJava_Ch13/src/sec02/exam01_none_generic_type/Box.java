package sec02.exam01_none_generic_type;

// Box 클래스
public class Box {
	private Object object;
	// Object : Java 클래스에서 최상위 부모 클래스. 모든 클래스가 Object 클래스를 상속 받음

	private Object obj1 = "java";
	private Object obj2 = 'j';
	private Object obj3 = 10;
	private Object obj4 = true;
	// 어떠한 객체든 Object 타입으로 저장할 수 있음.

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		// 매개변수 타입에 클래스가 오면 매개변수는 해당 클래스 객체뿐만 아니라 자식 클래스의 객체 또한 올 수 있다.
		// 즉 Object 클래스가 매겨변수의 타입이라면 어떠한 타입도 매개변수로 올 수 있다.
		// 자식 객체는 부모 타입으로 대입될 수 있다.

		this.object = object;
	}	
}