
public class FieldTest {
	protected int x = 100;
	int y;
	// 클래스의 멤버로서 선언하면 클래스 내에서 모두 사용 가능
	// 클래스의 필드에서는 접근제한자를 사용할 수 있음.
	// 클래스의 필드에서는 지정예약어를 사용할 수 없음.
	
	public void aaa() {
		final int z = 100;
		// z = 150;
			// 지역변수에서는 지정예약어를 사용할 수 있음.
		// private int e = 300;
			// 지역변수에서는 접근제한자를 사용할 수 없음.
		int w;
		
		// aaa 메소드 내에서만 사용 가능한 변수들. 지역변수.
		
		System.out.println("z = " + z);
		// System.out.println("w = " + w);
			//출력 불가능. w와 같이 메소드 내부에서 지역변수를 선언하면 runtime stack 영역에 메모리 할당.
			// runtime stack 영역은 쓰레기값으로 차있다. z는 100으로 초기화 시켜줬지만 w는 초기화가 되지 않은 상태.
	
		ccc();
		// private으로 선언된 메소드 ccc 호줄 가능.
		
	}
	public void bbb() {
		System.out.println("x = " + x);
		// 상위의 개념인 클래스에서 선언된 멤버이므로 사용 가능
		
		// System.out.println("z = " + z);
			// aaa메소드에서 선언된 지역변수이므로 사용 불가능.
		
		ccc();
		// private으로 선언된 메소드 ccc 호줄 가능.
	}
	private void ccc() {
		
	}
}
