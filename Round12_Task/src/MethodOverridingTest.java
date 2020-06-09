class MethodSuper {
	public void display() {
		System.out.println("Super 클래스 메서드");
	}
}
class MethodSub extends MethodSuper {
	public void display() {
		super.display();		// MethodSuper 클래스의 display() 호출
		System.out.println("Sub 클래스 메서드");
	}
}
public class MethodOverridingTest {
	public static void main(String[] ar) {
		MethodSub sub = new MethodSub();
		sub.display();
	}
}
