package sec10.exam03_static_be_careful;

public class Car {
	int speed;			// 인스턴스 필드
	
	void run() {		// 인스턴스 메소드
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] ar) {
		
//		speed = 60;		// static 메소드 내에서 인스턴스 멤버 사용 불가능.		
//		run();			// static 메소드 내에서 인스턴스 멤버 사용 불가능.
		
		Car car = new Car();	
		car.speed = 60;
		car.run();		
		// speed와 run() 메소드는 인스턴스 멤버이므로 
		// static 메소드(정적 메소드)인 main() 메소드에서 사용할 수 없다.
		// 정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고
		// 참조 변수로 접근해야 한다.
	}
}
