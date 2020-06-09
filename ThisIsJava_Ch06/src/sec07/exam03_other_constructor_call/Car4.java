package sec07.exam03_other_constructor_call;

public class Car4 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// this : 현재 실행 중인 객체.
	
	//생서자
	Car4() {
		
	}
	Car4(String model) {	// 이 메소드 호출 시 
//		this.model = model;
//		this.color = null;
//		this.maxSpeed = 0;
		
		this(model, null, 0);	
		//this() 메소드 실행. this()는 자기 자신의 다른 생성자를 호출하는 코드.
		//this() 메소드는 생성자의 제일 첫번? 줄에 입력함.
		//매개변수 값을 세 개 주었으므로 맨 아래의 생성자 메소드가 실행된다.
		//첫번째 매개변수 값은 전달받은 값이고 나머지는 쓰레기 값을 넣었다.
	}
	Car4(String model, String color) {	// 이 메소드 호출 시 
		this(model, color, 0);		
		//this() 메소드 실행. this()는 자기 자신의 다른 생성자를 호출하는 코드.
		//this() 메소드는 생성자의 제일 첫번? 줄에 입력함.
		//매개변수 값을 세 개 주었으므로 맨 아래의 생성자 메소드가 실행된다.
		//첫번째와 두번째 매개변수 값은 전달받은 값이고 나머지는 쓰레기 값을 넣었다.
		
	}
	Car4(String model, String color, int maxSpeed) {	
		this.model = model;								
		this.color = color;
		this.maxSpeed = maxSpeed;	
		// 위 두개의 메소드에서 호출받은 메소드
		// 위의 this() 메소드에서 값을 전달 받음.
	}	
}
