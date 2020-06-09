package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.B;
		// B 클래스가 public으로 선언되었다 하더라도 다른 패키지이므로 import 하여줌.

public class C {
//	A a;	//(x)		// A 클래스 접근 불가(컴파일 에러)	
							// 다른 패키지에서 사용할 수 없는 default 접근 제한자.
	B b;	//(o)		// B 클래스 접근 가능
}
