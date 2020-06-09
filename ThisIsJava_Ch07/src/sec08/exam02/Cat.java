package sec08.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	
	public void sound() {	//추상 메소드 재정의
		System.out.println("야옹");
	}
}
