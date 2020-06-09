package sec13.exam03_field_method_access.package1;

public class A {
	//필드
	public int field1;			//public 접근 제한
	int field2;					//default 접근 제한
	private int field3;			//private 접근 제한
	
	//생성자
	public A() {
		field1 = 1;		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		field2 = 1;		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.	
		field3 = 1;		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		
		method1();		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		method2();		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		method3();		//o //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		
	}
	
	//메소드
	public void method1() {		//public 접근 제한
		
	}
	void method2() {			//default 접근 제한
		
	}
	private void method3() {	//private 접근 제한
		
	}
}
