// 싱글톤패턴 : 클래스의 객체를 공용으로 하나만 사용할 용도로 제안한 패턴

public class MySingleton {
	private static MySingleton sing; //자신의 객체 선언.
		// 공유의 개념인 지정예약어 static을 사용햇지만 private으로 선언했으므로
		// 자기 자신 내부에서만 사용
	static {
		sing = new MySingleton();
		// heap 영역에 한 번만 할당. 한 번 할당해둔 것을 공유하겠다 해서 static 사용.
	}
	
 	private MySingleton() { //생성자 메소드. private으로 선언했으므로 
 							//자기 자신 내부에서만 사용 가능.
		
	}
	
 	// 위의 private으로 선언된 MySingleton 객체를 얻어가기 위해 메소드 생성.
	public static MySingleton getInstance() { // sing을 가져가기 위해 static 지정예약어 사용
		return sing;
	}
	
}
