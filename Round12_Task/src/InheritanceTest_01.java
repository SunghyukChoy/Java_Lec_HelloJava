// InheritanceTest.java에서 생략된 코드들. 작성하지 않더라도 작성한 것과 같다.

import java.lang.*;		// java.lang.*의 import 구문
class SubClass_01 extends Object {	//extends Object
	SubClass_01() {		// default 생성자 메서드
		super();		// super()나 this() 메서드 선언이 없을 경우 super()
	}
}
public class InheritanceTest_01 extends Object {
	public static void main(String[] ar) {
		SubClass_01 sub = new SubClass_01();
		// 다음의 11~15번 줄 모두 0번째 매개변수로 객체 전달이 생략됨.
		System.out.println("두 객체가 같니? " + sub.equals(sub));
		System.out.println("sub 객체의 클래스는? " + sub.getClass());
		System.out.println("sub 객체의 hashCode는? " + sub.hashCode());
		System.out.println("sub 객체를 표현하는 기본 문자열은? " + sub.toString());
		System.out.println("객체를 출력하면 자동으로 toString()이 호출되나? " + sub);
		//sub toString()에서 ".toString()"이 생략됨.
	}
}
