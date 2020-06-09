// BaseClass에서 변수 하나만 더 추가하고자 한다면?
// 클래스를 다시 만들 필요 없이 BaseClass를 상속 받으면 된다. 코드의 재사용과 확장 가능.
// 클래스는 하나만 상속 가능
public class ExtendsClass extends BaseClass {
	// BaseClass의 모든 멤버는 다 들엉와있다.
		// BaseClass는 Object 클래스를 상속 받음 따라서 
		// ExtendsClass는 BaseClass, Object 클래스 둘 다 상속 받음.
	private int r;
	
	public ExtendsClass() {
		this.r = 0;
	}
	public ExtendsClass(int x, int y, int r) {
		// x,y는 어떻게 전달??
			// 생성자는 super.display()와 같이 이름을 직접적으로 호출 불가능.
		super(x, y);
			// 이렇게 super() 사용하면 상위클래스 BaseClass의 생성자 호출 가능.
			// super()는 반드시 첫줄에 적어야 함.
			// super()나 this() 메서드 선언이 없을 경우 super()
		this.r = r;
	}
	public ExtendsClass(int x2, int y2) {
		super.x2 = x2;
		super.y2 = y2;
	}
	
	public void display() {
		
		System.out.println("r = " + r);
		// x,y는 어떻게 출력??
		super.display();
		// super 예약어 사용. 상위 클래스인 BaseClass의 display() 메서드를 실행함으로써
		// x, y 출력 가능.
		// super 객체를 통해 호출하는 것은 아무 곳에 적어도 됨.
		
		
//		System.out.println("x = " + x);
//		System.out.println("x = " + super.x);
			// 하위 클래스에서 상위클래스의 private으로 선언된 변수 접근 불가능.
			// 여기서 x == super.x 
			// ExtendsClass의 x가 BaseClass의 x를 의미하는 것이기 때문.
		System.out.println("r = " + this.r);
		
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
			// 상위클래스에서 package와 protected 접근제한자로 선언된 변수 접근 가능.
	}
	
	public static void main(String[] ar) {
		ExtendsClass ec = new ExtendsClass();
		
		ec.display(); 
		
	}
	
}
