class FieldSuper {
	int x = 100;
}
class FieldSub extends FieldSuper {
	int y = 200;
}
public class PolymorphismFieldTest {
	public static void main(String[] ar) {
		FieldSuper sup = new FieldSub();
	//  상위클래스 객체명 = new 하위클래스 생성자();	
		
		System.out.println("sup.x = " + sup.x);
//		System.out.println("sup.y = " + sup.y);		// 컴파일 오류
			// 상위클래스의 필드만 접근 가능 
	}
}
