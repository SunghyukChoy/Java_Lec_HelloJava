package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;	//o
//		a.field2 = 1;	//x		//default 필드 접근 불가. 컴파일 에러.
//		a.field3 = 1;	//x		//private 필드 접근 불가. 컴파일 에러.
		
		a.method1();	//o
//		a.method2();	//x		//default 메서드 접근 불가. 컴파일 에러.
//		a.method3();	//x		//private 메서드 접근 불가. 컴파일 에러.
	}
}
