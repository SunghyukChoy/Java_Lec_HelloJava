// 믹염중첩클래스는 타겟 클래스를 두고 그 클래스의 내용부를 원하는 대로 조금씩 변형시켜서 사용하는 형태
// 가장 많이 쓰이는 중첩클래스

class BaseClass { // 메세지를 한 번만 출력하고자 할 떄.
					// 그러나 BaseClass 하나만으로 두 가지 효과를 낼 수 있음.
	protected String message;
	public BaseClass(String m) {
		this.message = m;
	}
	public void display() {
		System.out.println("message = " + message);
	}
}
//class BaseClass2 { // 메세지를 3번 출력하고자 할 때.
//	private String message;
//	public BaseClass2(String m) {
//		this.message = m;
//	}
//	public void display() {
//		for(int i = 0; i < 3; i++) {
//		System.out.println("message = " + message);
//		}
//	}
//}
public class OuterClass4 {
	public void display() {
		BaseClass bc1 = new BaseClass("this is message") { // 여기서 정의부(중괄호)를 열면 BaseClass 자체에 access 가능.
			public void aaa() {	// 선언하는 것은 가능. 정의부이기 때문에 선언하는 것은 가능.
				System.out.println("Test");
			}
			// 이때 BaseClass 내의 display()를 재정의 한다면 
			public void display() {
				aaa(); // 호출 가능.
				for(int i = 0; i < 3; i++) {
					System.out.println("Message = " + message);
				}
			}
		};		
		bc1.display(); // 재정의 후 메세지 세 번 출력
//		bc1.aaa();	// bc1이라는 것은 BaseClass이기 때무에 BaseClass 안에 aaa() 없음.
					// 따라서 선언은 가능하나 외부에서 호출하는 것은 불가능.
			
	}
	public static void main(String[] ar) {
		OuterClass4 out = new OuterClass4();
		out.display();
	}
//	public static void main(String[] ar) {
//		BaseClass bc = new BaseClass("abc");
//		bc.display();
//	}	
	
	
	

}
