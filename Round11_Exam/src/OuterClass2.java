/* 정적 충첩클래스(static 중첩클래스)의 객체를 선언하는 방법 */
/* Outer.Inner 객체 = new Outer.Inner(); */	
public class OuterClass2 {
	private int x = 100;
	private static int x2 = 200;
	OuterClass2() {
		
	}
	public void display() {
		System.out.println("x = " + x);
		System.out.println("x2 = " + x2);
	}
	public static void main(String[] ar) {
		OuterClass2.InnerClass in1 = new OuterClass2.InnerClass(500, 5000);
		OuterClass2.InnerClass in2 = new OuterClass2.InnerClass(1000, 10000);
		
		in1.display();
		in2.display();
		in1.display2();
			// static 메소드이기 떄문에 클래스명으로 접근 가능
			// in1.display2(); == InnerClass.display2();
		InnerClass.display2();
		in2.display2();
			// in2.display2(); == InnerClass.display2();
		InnerClass.display2();
		
		
	}
	public static class InnerClass {
	// 이미 존재하는 클래스임에도 불구하고(OuterClass.java파일에 존재하는 클래스)
	// 충돌하지 않는 이유는  OuterClass.InnerClass != OuterClass2.InnerClass이기 때문.
		private int y = 300;
		private static int z = 400;
		InnerClass(int y, int z) {
			this.y = y;
			this.z = z;
		}
		public void display() {
			System.out.println("y = " + y);			
		}
		public static void display2() {
			System.out.println("z = " + z);
		}
	}
}
