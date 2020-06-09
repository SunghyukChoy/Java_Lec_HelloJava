class Outer_02 {
	int x = 100;
	public void display() {
		System.out.println("x = " + x);
//		System.out.println("y = " + y); // 컴파일 오류 발생
	}									// Inner_02 클래스의 내부 접근 불가능
										// Inner_02 클래스까지는 접근 가능
	class Inner_02 {
		int y = 200;
	}
}	

public class InnerClassTest_02 {
	public static void main(String[] ar) {
		Outer_02 ot = new Outer_02();

		ot.display();		
	}
}
