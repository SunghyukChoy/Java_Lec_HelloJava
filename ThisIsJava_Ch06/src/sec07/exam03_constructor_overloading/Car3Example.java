package sec07.exam03_constructor_overloading;

public class Car3Example {

	public static void main(String[] args) {
		Car3 car1 = new Car3();	
		System.out.println("car1.company = " + car1.company);
		System.out.println("car1.model = " + car1.model);
		System.out.println("car1.color = " + car1.color);
		System.out.println("car1.maxSpeed = " + car1.maxSpeed);
		System.out.println();
		// 초기화 되지 않은 값들 은 null, 0 등으로 출력
		// 힙 영역에 저장되는 필드(=전역 변수, 멤버 변수)는 쓰레기값을 초기화값으로 가짐. 
		
		Car3 car2 = new Car3("자가용");
		System.out.println("car2.company = " + car2.company);
		System.out.println("car2.model = " + car2.model);
		System.out.println("car2.color = " + car2.color);
		System.out.println("car2.maxSpeed = " + car2.maxSpeed);
		System.out.println();
		
		Car3 car3 = new Car3("자가용", "빨강");
		System.out.println("car3.company = " + car3.company);
		System.out.println("car3.model = " + car3.model);
		System.out.println("car3.color = " + car3.color);
		System.out.println("car3.color = " + car3.maxSpeed);
		System.out.println();
		
		Car3 car4 = new Car3("택시", "검정", 200);
		System.out.println("car4.company = " + car4.company);
		System.out.println("car4.model = " + car4.model);
		System.out.println("car4.color = " + car4.color);
		System.out.println("car4.maxSpeed = " + car4.maxSpeed);
	}

}
