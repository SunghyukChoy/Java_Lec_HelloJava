package class00;

/* 메인 클래스 */
public class BicycleTest {
	public static void main(String[] args) {
		// 자전거 객체 생성
		Bicycle2 b1 = new Bicycle2("로드형 자전거", 7.25, 326000);
		Bicycle2 b2 = new Bicycle2("산악형 자전거", 18.68, 429000);

		// 객체 필드값 초기화
//		b1.name = "로드형 자전거";
		b1.setName("로드형 자전거");
//		b1.weight = 7.25;
//		b1.price = 326000;

//		b2.name = "산악형 자전거";
//		b2.weight = 18.68;
//		b2.price = 429000;
		// 객체 정보 출력
		System.out.printf("b1 => { name: %s, weight: %.2fkg, price: %d원 }\n", b1.getName(), b1.getWeight(), b1.getPrice());
		System.out.printf("b2 => { name: %s, weight: %.2fkg, price: %d원 }\n", b2.getName(), b2.getWeight(), b2.getPrice());

		b1.horn();
		b2.move();
		
		b1.setRpm(3000);	
		
		System.out.println("print bycicle1 speed: " + b1.getSpeed()); 
		// 필요한 값을 설정은 하지만 속도 구하는 공식은 알 필요가 없다
		
	}
}

/* 자전거 클래스 */
class Bicycle2 {
	/* 필드 */
	private String name; // 이름
	private double weight; // 무게
	private int price; // 가격
	private int rpm;

	public Bicycle2(String name, double weight, int price) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	/* 메소드 */
	public void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}

	public void horn() {
		System.out.println("따르르릉! 지나갈게요~");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public double getSpeed() {
		return calculateSpeedByRPM();
	}

	protected void inheritedMethod() {
		
	}
	
	private double calculateSpeedByRPM() {
		return this.rpm * 0.12 / this.weight;
	}
}

class WoodBycicle extends Bicycle2 {

	public WoodBycicle(String name, double weight, int price) {
		super(name, weight, price);
	}
	
	public void Test() {
		inheritedMethod();		// protected
		getSpeed();				// public
		//calculateSpeedByRPM();	// private
	}
}