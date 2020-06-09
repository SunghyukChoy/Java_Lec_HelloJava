// 지역중첩클래스는 메서드 내부에서만 사용할 목적으로 선언된 클래스
// 익명중첩클래스의 바탕이 된다.
public class LocalInnerClassTest {
	public static void main(String[] ar) {
		/* 지역 변수들 */
		int w = 100;
		final int x = 200;
		
		final class LocalInner { // 지역 중첩 클래스 선언 시 final을 제외한 지정예약어 사용 불가능(static 등)
								// 접근제한자 사용 불가능.
			/* 멤버 필드들 */
			// 지역중첩클래스의 내부에서는 일반 클래스와 동일하게 접근제한자들과 
			// static을 제외한 지정예약어 사용 가능
			private int  y = 300;
			protected int z = 400;
			public LocalInner() {	//생성자 메서드
				
			}
			public void display() {	// 일반 메서드. 
				System.out.println("w = " + w);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("z = " + z);
				
				//현재 지역중첩클래스가 선언된 메서드. 즉 void main() 내부의 모든 변수나 객체 사용 가능.
			}			
		}
		LocalInner inner = new LocalInner(); // 지역중첩클래스 객체 생성
		inner.display();	// 메서드 호출   
	}
}
