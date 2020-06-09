class Parent_01 {
	protected int x = 100;
}
class Child_01 extends Parent_01 {
	private int y = 200;
	public void display() {
		System.out.println("Parent_01 클래스의 x = " + super.x);
		System.out.println("Child_01 클래스의 y = " + this.y);
	}
}
public class FieldNameExtensionTest {
	public static void main(String[] ar) {
		Child_01 child = new Child_01();
		child.display();
	}
}
