abstract class A {
	public abstract void display();
}
abstract class B extends A {
	
}
class C extends B {
	public void display() {
		
	}	
}
public class InstanceTest {
	public static void main(String[] ar) {
	//	A ap = new A();		// 컴파일 오류
	//	B bp = new B();		// 컴파일 오류
		C cp = new C();		// 컴파일, 실행 성공
	//	A dp = new B();		// 컴파일 오류
		A ep = new C();		// 컴파일, 실행 성공
		B fp = new C();		// 컴파일, 실행 성공
	}
}
