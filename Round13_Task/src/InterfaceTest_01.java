interface MyInterface_01 {
	void method_01();
	public abstract void method_02();	
}
class ImplClass implements MyInterface_01 {
/*	void method_01() {		// 컴파일 오류 -> public으로 오버라이딩 해야 함
		System.out.println("method_01 override!");
	}	*/
	public void method_01() {
		System.out.println("method_01 override!");
	}
	public void method_02() {
		System.out.println("method_02 override!");
	}
}
public class InterfaceTest_01 {
	public static void main(String[] ar) {
		ImplClass ic = new ImplClass();
		ic.method_01();
		ic.method_02();
	}
}
