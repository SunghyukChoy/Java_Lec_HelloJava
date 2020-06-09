/* 추상클래스 : 다형성에 의한 구현이 가능하도록 필수적인 속성이나 내용만 정의하고 
 	그 외의 영역은 미완성으로 개념만 정의한 메서드(추상메서드)를 포함하는 클래스 
 	지정예약어 자리아 abstract 예약어 입력하여 사용 중괄호 내용부{} 기재x 소괄호() 뒤 세미콜론;
 	추상클래스는 객체를 생성하지 못함.
 	다형성의 개념을 쓰되, 이 클래스로는 쓰지 못하게 만들고자 할 떄 사용하는 클래스*/


abstract class Animal {		// 추상 메소드를 하나라도 포함하는 클래스는 무조건 추상 클래스로 만들어 준다
							// abstract 예약어는 객체 생성이 불가능하다는 뜻.
	// public void cry() {
		// 주체에 따라 동작이 달라짐 개: 멍멍 고양이: 야옹
		// 운다라는 개념만 디자인 해둠. 재정의 하여 사용하기 위해 생성한 메소드
		// 이렇게 실제로 내용부가 없는 경우 추상 메소드로 생성 가능
	public abstract void cry();
		// Animal 클래스를 상속받는 모든 클래스는 cry()를 반드시 오버라이딩 해야함.
		
	
}
class Cat extends Animal {
	public void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	public void cry() {
		System.out.println("멍멍");
	}
}
public class AnimalTest {
	public static void main(String[] ar) {
		Animal[] ani = new Animal[10];	// 배열 공간 생성은 객체 생성과는 별개
		ani[0] = new Cat();
		ani[1] = new Dog();
		
		ani[0].cry();		//Animal 클래스에 cry()메소드를 만들기 전까진 컴파일 오류
		ani[1].cry();		//Animal 클래스에 cry()메소드를 만들기 전까진 컴파일 오류
	
		Cat cat = new Cat();
		Animal ani2 = new Dog();
		// Animal ani3 = new Animal();	// 정의가 되자 않은 추상 메소드를 포함하고 있기 때문에 
										// 객체를 생성할 수 없다.
		
	}	
}
