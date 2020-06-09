class A {
	String name;
	int age;
	A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class B {
	Object key;
	Object value;
	public B(Object k, Object v) {
		this.key = k;
		this.value = v;
	}
}
public class GenericTest {
	public static void main(String[] ar) {
		A ap = new A("현아", 10);	
			// 클래스 A의 객체 생성 시 이미 선언된 자료형에 맞는 값을 대입하여야 함.
			// 호출을 하는 쪽에서 자료형을 정하는 것이 아니라 이미 정해져 있는 자료형에 맞춰서 값을 대입함.
		ap.setName("은하");	// 메소드도 마찬가지. String으로 정해져 있으므로 문자열을 대입하여야 함.
				// 지금까지는 호출하는 쪽이 아니라 정의되어 있는 쪽이 기준이었음.
				// 제네릭은 호출하는 쪽에서 자료형을 정할 수 있음. 반복적인 코딩을 줄일 수 있음
		B bp = new B("신비", 21);
		B cp = new B(16.20, 50.0); 
			// 호출하는 쪽에서 자료형을 결정하기 위해서 Object 타입으로 변수를 선언함.
			// 여러 클래스를 만들 필요 없이 원하는 자료형의 유사한 객체를 만들 수 있음.
			// 문제는  key와 value에 어떤 값이 들어갔는지 알 수 없음.
			// 그래서 나온 방식이 제네릭
			// 정해져 있지 않은 타입에 대해서 호출하는 순간에 자료형을 설정해서 사용할 수 있는 방법. 
	}
}
