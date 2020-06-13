package sec04.exam01_generic_method;

// 제네릭 메소드 호출
public class BoxingMethodExample {

	public static void main(String[] args) {

		Box<Integer> box1 = Util.<Integer>boxing(100);
		// Util.boxiing : 정적 메소드(static)이므로 클래스명으로 접근 가능
		// 매개값으로 100을 넣으려면 매개변수 타입을 Integer로 지정.
		// Util.<Integer>boxing(100) : 메소드 호출 시 메소드의 매개변수 타입을 Integer로 지정.
		// 같은 제네릭 타입을 가져야 하므로 나머지 T들도 Integer로 지정됨.
		// Box<Integer> box1 : Box 객체 생성 시의 타입 지정. -> 메소드의 리턴타입이 됨.
		// 위의 boxing 메소드는 box1의 변수 var에 100을 저장함. (setter와 같은 역할?)
		int intValue = box1.getVar();
		// box1의 변수 var의 값을 가져와 intValue에 저장
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("홍길동");
		// Util.boxing("홍길동") : 매개변수의 타입을 지정하지 않아도 매개값에 따라 컴파일러가 유추함. 더 일반적인 사용
		// Box<String> box2에서 제네릭 타입을 지정하지 않으면 Object형이 됨. 캐스팅 필요.
		String strValue = box2.getVar();
		System.out.println(strValue);
	}
}