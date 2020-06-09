class A {
	public A() throws Exception{
		
	}
}
public class Constructor extends A {
						// 예외전가가 있는 메소드 상속 시 컴파일 오류 발생
	public Constructor() throws Exception {	// 생성자 메서드에서는 예외전가만 가능.
				// 클래스 생성 시 생성자 메소드가 자동으로 만들어지고 생략되어 있는데 
		super();
				// this()나 super()가 없는 경우 자동으로 super()가 삽입되기 떄문에
				// 예외전가를 한 메서드를 호출하게 됨. 따라서 상속 받은 클래스에서도 예외전가를 해줌.				
	}
}
