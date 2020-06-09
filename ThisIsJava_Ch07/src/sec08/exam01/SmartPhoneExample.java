package sec08.exam01;

public class SmartPhoneExample {
	public static void main(String[] ar) {
//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();		//Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();		//Phone의 메소드

	}
}
