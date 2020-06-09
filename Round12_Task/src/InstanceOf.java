class A {

}

class B extends A {

}

public class InstanceOf {
	public static void main(String[] ar) {
		A ap = new B();
		// B bp = ap; 		// 컴파일 오류
		// B bp = (B)ap;	// 만약 A ap = new A();라면? 컴파일 가능하나 실행 중 오류
					//캐스팅
		
		// 이와 같은 경우를 대비해 캐스팅을 할 수 있는지 확인		
		B bp = null;
		if (ap instanceof B) {
				// ap 객체가 B 클로스로 생성되었으면 값으로 true를 반환하라.
			bp = (B)ap;
			System.out.println("형변환이 가능하다.");
		} else {
			System.out.println("형변환이 불가능하다");
		}
	}
}
