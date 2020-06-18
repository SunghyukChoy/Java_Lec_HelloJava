package sec05.exam01_bounded_type;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		// T에 올 수 있는 구체적인 타입은 Number이거나 Number의 자식 클래스.

		double v1 = t1.doubleValue(); // Number의 doubleValue() 메소드 사용
		double v2 = t2.doubleValue(); // Number의 doubleValue() 메소드 사용
		return Double.compare(v1, v2);
		// v1이 더 작으면 -1, v1이 더 크면 1 리턴
	}
}
