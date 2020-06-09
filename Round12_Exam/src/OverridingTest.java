/* 메소드의 상속과 오버라이딩 */
// 하위 클래스의 메소드는 접근제한자의 범위가 상위클래스의 메서드의 제한자보다 같거나 커야 한다.
// 접근제한자의 범위 : private < package < protected < public
// 상위 클래스 메소드의 접근제한자가 protected라면 하위클래스 메소드의 접근제한자는 protected,public
// 하위 클래스의 메서드에 throws 구문이 있으면 상위 클래스에도 throws 구문이 있어야 한다.


class First {
	public void aaa() throws Exception {
		System.out.println("First aaa");
	}
}
class second extends First {
	public void aaa(String str) {
		System.out.println("Second aaa : " + str);		
	}
	//first 클래스의 aaa() 메소드와 second 클래스의 aaa(str) 메소드는 오버로딩 관계.
	//first를 상속받았기 때문에 second 클래스에 aaa() 메소드가 그대로 있다고 봄.
	public void aaa() throws Exception {
		System.out.println("second aaa");
	} //first 클래스의 aaa() 메소드와 second 클래스의 aaa() 메소드는 오버라이딩 관계.
	  // 상속받은 aaa() 메소드를 재정의 하여줌.	
}

public class OverridingTest {
	public static void main(String[] ar) throws Exception {
									// 객체를 만드는 Second에 throws 구문이 있으므로 main에서도 만들어 줌.
		second obj = new second();
		obj.aaa();
			//매개변수가 없는 aaa() 메소드 실행 시 상위 클래스의 aaa() 메소드 실행
			// aaa() 메소드 재정의 후 Second 클래스의 aaa() 메소드 실행.
		obj.aaa("Test");
			//매개변수가 있는 aaa() 메소드 실행 시 second 클래스의 aaa() 메소드 실행
	}
}



/* 다형성이란 것이 왜 생겼는가 */
// 유사한 내용들을 모아서 관리하기 위해, 특정한 내용들을 재사용해서 쓸 수 있도록 규칙을 부모클래스에 위임해주기 위한 방법