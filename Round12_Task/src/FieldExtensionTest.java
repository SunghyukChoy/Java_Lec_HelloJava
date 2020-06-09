class Parent {
	private int x = 100;
	private int y = 200;
}
class Child extends Parent {
	private int r = 300;	
	public void display() {
	//	System.out.println("x = " + x);	// 컴파일 오류
	//	System.out.println("y = " + y);	// 컴파일 오류
			// 상속 받았다 하더라도 private 접근제한자이기 때문에 접근 안 됨.
			// protected or public으로 선언 
		System.out.println("r = " + r);
	}
}
public class FieldExtensionTest {
	public static void main(String[] ar) {
		Child child = new Child();
		child.display();
	}
}
