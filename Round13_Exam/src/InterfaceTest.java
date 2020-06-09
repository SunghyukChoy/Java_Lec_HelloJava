/* 인터페이스 : 순수 디자인을 목적으로(정의부 없음) 만든 클래스로 다중 상속이 가능	
 * 자바 인터페이스 : 필드(final static으로 선언된 필드, 고정값) + 선언적 메소드(내용이 없는, 추상메소드)
			+ 정적 중첩클래스/중첩 인터페이스
	선언 : 접근제한자 + interface + 인터페이스명 + extends 상위인터페이스들 { 내용부 } 
	// 인터페이스는 정의부가 없는 개념으로 정의부가 있는 class는 상속받지 못 한다 
	서로 같은 유형끼리의 상속은 extends 다른 유형끼리의 상속(interface가 class스에 상속을 줄 때.
	interface는 class로부터 상속을 받을 수 없다)에서는 implements */
	// 필수적인 정보를 셋팅하고 그 외 나머지 옵션적인 요소들은 디자인 할 수 있도록 풀어주느냐 
	// 아니면 아예 완전히 순수하게 디자인 할 목적으로 구현을 하느냐에 따라 추상클래스와 인터페이스 형태로 나뉨

interface FirstInter {	// 인터페이스 내부에 선언되는 것들은 전부 다 public static final이다.
	int x = 100;	// (public static final) int x = 100;
	// int y;	// final로 선언된 변수이므로 값을 반드시 초기화 해줌.
	
	void display(); 
		// public abstract가 생략되어 있음. public abstract void display();
	/*{
		System.out.println("display");
	} */	// 디자인이 목적이므로 정의부 가질 수 없음. 추상메소드처럼 정의함.
	
	public static class Inner { // public static 생략 가능.
		int y = 200;
		int z;
		public Inner() {
			
		}
		public void aaa() {
			
		}		
	}
	public interface InnerInterface {
		int a = 500;
	}
}
class SecondInter implements FirstInter {
					// 서로 다른 유형이므로 implements	// 추상메소드를 상속 받았으므로 반드시 재정의 해줌.
//	(static final int x = 100;) 상속 받음
	
	public void display() {	 // 재정의 시 abstract 예약어는 빼고 함. 넣으면 이것 또한 추상메소드가 됨.
		System.out.println("x = " + x);
	};
}


public class InterfaceTest {
	public static void main(String[] ar) {
		// FirstInter fi = new FirstInter();	// 생성자 메소드가 없기 때문..객체 생성 안 됨.
		FirstInter fi = new SecondInter();	// FirstInter를 상속받은 SecondInter를 통해 객체 생성 가능	
		
		System.out.println(fi.x);
		System.out.println(FirstInter.x);	// static으로 선언된 필드이므로 클래스명으로 접근 가능
		System.out.println(SecondInter.x);	// public static final int x = 100을 상속 받음
		
		// fi.x = 200;		// final로 선언된 필드. 값 변경 안 됨.
		
		fi.display();
	}
}
