package sec10.exam04_singleton;

public class Singleton {
	public static Singleton singleton = new Singleton();
		// 아래의 정적 메소드에서 사용할 수 있게 정적 필드로 선언한다.
		// 필드 singleton은 자신의 객체를 참조한다.
		// 외부에서 필드값을 바꾸지 못하도록 private으로 선언한다.
			// 사실 필드명.으로 접근이 되지 않기 때문에 public으로 선언할 수도 있지만
			// public 선언 시 리플렉션이라는 편법을 통해 조작 가능해짐(나중에 알게 됨...지금은 어려움)
			// 명시적인 확정이라는 측면도 있음.
	private Singleton() {
		// 외부에서 생성자 호출하는 것을 막기 위해 private으로 선언해준다.
		
	}
	
	static Singleton getInstance() {
		// singleton의 자료형에 맞는 Singleton.
		// 외부에서 생성자에 접근할 수 없고, 그에 따라 객체를 생성할 수 없으므로 
		// 클래스 명으로 접근할 수 있는 정적 메소드를 선언한다.
		return singleton;
	}
}
