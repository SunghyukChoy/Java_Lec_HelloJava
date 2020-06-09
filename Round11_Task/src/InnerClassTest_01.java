class Outer_01 {
	int x = 100;
	class Inner_01 {
		int y = 200;
		public void display() {
			System.out.println("x = " + x); // Outer_01의 멤버 x 사용.
			System.out.println("y = " + y);
		}
	}
}   
public class InnerClassTest_01 {
	public static void main(String[] ar) {
		Outer_01 ot = new Outer_01();
		Outer_01.Inner_01 oi = ot.new Inner_01();
		
		oi.display();
	}
}
