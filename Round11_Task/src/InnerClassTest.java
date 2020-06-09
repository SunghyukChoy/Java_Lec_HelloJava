class Outer {
	int x = 100;
	class Inner {
		int y = 200;
	}
}
public class InnerClassTest {
	public static void main(String[] ar) {
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		
		System.out.println("x = " + ot.x);
		System.out.println("y = " + oi.y);
	}
}
