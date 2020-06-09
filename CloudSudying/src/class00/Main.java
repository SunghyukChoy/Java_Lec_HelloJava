 package class00;

/* 메인 클래스 */
public class Main { // main 메소드가 있는 main 클래스. public 있음.
	public static void main(String[] args) {
		/* 1. 자전거 객체 생성 */
		Bicycle b = new Bicycle();
		// Bicycle 객체를 새롭게 만들어 BIcycle 타입의 변수 b에 대입.
		// Bicycle 클래스명과 타입과 new Bicycle 세 개가 이름이 같아야 함.

		/* 2. 객체 필드값 초기화 */
		b.name = "로드형 자전거";
		b.weight = 7.25;
		b.price = 326000;

		/* 3. 객체 정보 출력 */
		System.out.printf("[자전거] { name: %s, weight: %.2fkg, price: %d원 }", b.name, b.weight, b.price);
	}
}

/* 자전거 클래스 */
class Bicycle { // Bicycle 클래스. public 없음.
	/* 필드 */ // 정보들 담고 있음.
	String name; // 이름
	double weight; // 무게
	int price; // 가격

	/* 메소드 */ // 동작을 담고 있음.
	public void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}

	public void horn() {
		System.out.println("따르르릉! 지나갈게요~");
	}
} 

