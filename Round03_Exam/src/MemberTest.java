// 실무에서 대부분 하나의 파일에는 하나의 클래스를 만든다. 클래스 내부에 또다른 클래스를 만드는 것은 관계없다
public class MemberTest {
	class A {
		
	}
	class B {
		
	} // 하나의 클래스 내에는 또다른 클래스의 군집이 들어갈 수 있다.
	
	// Fields
	int xpos = 10;
	int ypos = 20;
	
	//Consturct // 클래스와 동일한 이름으로 되어있는 메서드 형태
	MemberTest() {
		//.....
	}
	
	//Methods
	public static void main(String[] ar) {
		// 블록으로 시작해서 블록으로 끝나는 특징을 갖는 메서드
	}
	public void aaa() {
		
	}
	
}

// 이러한 내용들이 하나의 클래스 안에 존재할 수 있는 내용들이다.