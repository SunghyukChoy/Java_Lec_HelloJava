class PolyMethodSuper {
	public void method_01() {
		System.out.println("method_01");		
	}
	public void method_02() {
		System.out.println("method_02");
	}
}
class PolyMethodSub extends PolyMethodSuper {
	public void method_02() {
		System.out.println("method_02 override");
	}
	public void method_03() {
		System.out.println("method_03");
	}
}
public class PolymorphismMethodTest {
	public static void main(String[] ar) {
		PolyMethodSuper sup = new PolyMethodSub();
		sup.method_01();
		sup.method_02();
		//sup.method_03();		// 컴파일 오류 발생
	}
}
