/* 일반중첩클래스의 객체 생성 방법 */
/* Outer 객체1 = new Outer();            -> outer클래스의 객체를 생성하는 방법
 * Outer.Inner 객체2 = 객체1.new Inner();  -> inner클래스의 객체를 생성하는 방법
 */
public class OuterClass {	
	/*클래스 내부에 선언 가능한 멤버들*/
	//이너클래스//
	public class InnerClass {
		// 중첩클래스 내에서 멤버 선언 가능
		private int y = 200;
//		private static int z = 300;
			// 일반중첩클래스 내부에서 static을 사용하지 못 하는 이유
			// 내부클래스라는 것은 공유의 속성을 가지지 않음. OuterClass의 종속 필드. 외부에서 접근 불가능. 
			// InnerClass 자체를 static으로 선언하여 사용 가능.
		InnerClass(int y) {
			this.y = y;
		}
		public void display() {
			System.out.println("y = " + y);
		}
	}	
	//멤버 필드//
	private int x = 100;	
	//생성자 메소드//
	OuterClass() {
		
	}
	//일반적인 메소드//
	public void display() {
		System.out.println("x = " + x);
	}
	public static void main(String[] ar) {
		// 메인 메소드 내에서 OuterClass, InnerClass 모두 사용 가능.
		OuterClass out1 = new OuterClass();
		OuterClass.InnerClass in1 = out1.new InnerClass(500);
		OuterClass.InnerClass in2 = out1.new InnerClass(1000);
		
		out1.display(); //OuterClass 의 x값 출력
		in1.display();	//InnerClass 의 x값 출력
		in2.display();  
	}	
}
class A { //중첩클래스와는 다른 OuterClass와 별개의 클래스
	
}


