
public class ExtendsClassTest {
	public static void main(String[] ar) {
		
		ExtendsClass ex = new ExtendsClass(100, 200);
//		System.out.println(ex.x);
//		System.out.println(ex.y);
//		System.out.println(ex.r);
		// 접근제한자 모두 private 접근 안 됨.
		
		System.out.println(ex.x2); //BaseClass에서 package로 선언. 같은 폴더 내에 있기 때문에 접근됨.
		System.out.println(ex.y2);	// BaseClass에서 protected로 선언. 같은 폴더 내에 있기 떄문에 접근됨.
//		System.out.println(ex.r);	// private 선언. 접근 안 됨.
		
		// package 제한자 : 같은 package(폴더) 안에 있을 떄만 사용 가능. 다르면 사용 불가능.
		// protected 제한자 : 서로 다른 package에 있더라도 상속이 되면 쓸 수 있다.
		
		ex.display();
	}
}

