package sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// int result1 = Util.compare("a", "b");
		// String은 Number의 자식 클래스 타입이 아니므로 배개변수로 문자열을 가질 수 없다.

		int result1 = Util.<Integer>compare(10, 20);		
		// <Integer> 생략 가능
		// 10, 20 -> Integer 자동 Boxing
		System.out.println(result1);

		int result2 = Util.compare(4.5, 3);
		// 4.5 -> Double 자동 Boxing
		System.out.println(result2);
	}

}
