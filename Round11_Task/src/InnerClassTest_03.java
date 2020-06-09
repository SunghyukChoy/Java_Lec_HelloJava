class Outer_03 {
	static int x = 100;
	/*
	public static void display() {
		Inner_03 inner = new Inner_03(); 	//컴파일 오류
		// 내부클래스라는 것은 공유의 속성을 가지지 않음. Outer클래스의 종속 필드. 외부에서 접근 불가능.
	}
	*/
	class Inner_03 {
		int y = 200;
		// static int z = 300;			//컴파일 오류
		// 내부클래스라는 것은 공유의 속성을 가지지 않음. Outer클래스의 종속 필드. 외부에서 접근 불가능.
		public void display() {
			System.out.println("x = " + Outer_03.x); // 정상 실행
			//outer 클래스에서 static으로 선언된 멤버 호출 가능
			System.out.println("y = " + y);			
		}
	}
}
public class InnerClassTest_03 {
	public static void main(String[] ar) {
		Outer_03 ot = new Outer_03();
		Outer_03.Inner_03 oi = ot.new Inner_03();
		
		oi.display();
	}
}
