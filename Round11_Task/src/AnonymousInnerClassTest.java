class AnonymousInnerClass {
	private int u = 100;
	protected int v = 200;
	int w = 300;
	public static int x = 400;
	
	public void display() {
		// 내용부 없음. 작성 가능. 필요할 때 재정의 하여 사용.
		// 재정의 하지 않고 사용 시 원래의 내용 실행. 재정의 하고 사용 시 재정의 된 내용 실행.
	}
	public static void display_01() {
		// 이 메서드는 재정의 할 수 없음.
		// static 관련 멤버는 재정의 자체가 되지 않는다. 
		// 필요한 경우 클래스 이름으로 직접 접근하여 사용 
	}
}
public class AnonymousInnerClassTest {
	public static void main(String[] ar) {
		int y = 500;		// 익명중첩클래스 내부에서 사용 가능.
		final int z = 600;	// 익명중첩클래스 내부에서 사용 가능.
		
		AnonymousInnerClass inner_01 = new AnonymousInnerClass() {	// 내용부를 재정의 하기 위해 {} 사용
			public int t = 0;	//기존에 존재하지 않는 멤버 필드. 외부에서는 사용 불가능. 현재의 익명중첩클래스 내에서만 사용 가능.			
			public void display() {	//재정의
				System.out.println("t = " + t);
				// System.out.println("u = " + u); //private은 접근 안 됨.
				System.out.println("v = " + v);
				System.out.println("w = " + w);
				System.out.println("x = " + x);
				System.out.println("y = " + y);	// 값을 변경하면 오류 발생
				System.out.println("z = " + z);				
			}
			public void other() { // 기존에 존재하지 않는 멤버 메서드. 외부에서 사용 불가능. 현재의 익명중첩클래스 내에서만 사용 가능.				
				System.out.println("추가로 작성된 메서드");
			}
		};
		inner_01.display();
		System.out.println("v = " + inner_01.v); //클래스의 원래 멤버. 접근제한자에 따라 접근 가능.
		//inner_01.other();	//원래 클래스에 존재하지 않는 멤버는 외부에서 직접 사용 불가.
		//System.out.println("t = " + inner_01.t); // 외부에서 직접 사용 불가.
		
		AnonymousInnerClass inner_02 = new AnonymousInnerClass() {
			public void display() {
				System.out.println("또 다른 정의");
			}
		};
		inner_02.display(); // inner_02 객체가 참조하는 익명중첩클래스의 재정의 메서드 실행
	}
}
