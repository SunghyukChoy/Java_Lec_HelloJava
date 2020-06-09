class S_Outer {
	private int x = 100;	
		// static으로 선언하면 inner 클래스에서 사용 가능
	private static int x2 = 150;
	static class StaticInner {
		private int y = 200;
		public void display() {
		//	System.out.println("x = " + x); //컴파일 오류 발생.
			System.out.println("x2 = " + x2);
			System.out.println("y = " + y);		
		}
	}
}
public class StaticInnerClassTest {
	public static void main(String[] ar) {
		S_Outer.StaticInner oi = new S_Outer.StaticInner();		
		oi.display();		
	}
}
