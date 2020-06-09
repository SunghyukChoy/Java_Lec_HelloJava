package sec09.exam01_instance_member;
//this :
	//객체(인스턴스) 자신의 참조(번지)를 가지고 있는 키워드이다.
	//객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 this을 붙일 수 있다.
	//주로 매개변수와 필드명이 동일할 경우 인스턴스 필드임을 명확히 하기 위해 붙인다.
	//this는 인스턴스 메소드 안에서만 사용.

public class Car7 {
	String model;
	int speed;
	
	Car7(String model) {
		this.model = model;
		
	}	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 " + this.speed + " km/h)");
			//필드와 매개변수가 충돌할 일은 없지만 명확히 표시하기 위해 this 사용. 생략 가능.
			//setSpeed 역시 자식의 메소드임을 명확히 하기 위해 사용. 생략 가능.
		}
	}
}
