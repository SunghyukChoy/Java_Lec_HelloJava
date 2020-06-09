class Outer_02_rev {
	int x = 100;
	public void display() {
		System.out.println("x = " + x);
//		System.out.println("y = " + y);	 //컴파일 오류 발생
		Inner_02 in = new Inner_02();	
		// 객체 생성
		System.out.println("y = " + in.y);
	}
	class Inner_02 {
		int y = 200;
	}
}


public class InnerClassTest_02_rev {
	public static void main(String[] ar) {
		Outer_02_rev ot = new Outer_02_rev();
		
		ot.display();
	}
}
