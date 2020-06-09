class Animal {
	private String name;
	public Animal(String str) {
		this.name = str;	// 전달 받은 str로 name 설정
	}
	public String getName() {
		return name;	// 위의 name을 가져가는 메서드.
	}
}
class Dog extends Animal implements Runnable {
	public Dog(String str) {
		super(str);	// 상속 받은 Animal의 생성자 메소드. 전달 받은 매개변수 str을 넣어 name 값 설정해 줌.
	}	
	public void run() {
		for(int n = 0; n <= 100;) {
			try {
				Thread.sleep((int)(Math.random() * 100) + 100); // 시간 지연. 난수로 생성.
			} catch(InterruptedException e) {}
			 n += (int)(Math.random() * 10) + 1; // for문의 n 증감식. 이동거리를 난수로 생성. 1 ~ 10.
			 if(n > 100) break;	// 100미터 통과 시 반복문 빠져나옴.
			 System.out.println(getName() + " 현재 위치 : " + n + "m - 멍멍~");		
		}
		System.out.println(getName() + "가 결승선을 통과했습니다. 멍멍~");
	}
}
class Cat extends Animal implements Runnable {
	public Cat(String str) {
		super(str);
	}	
	public void run() {
		for(int n = 0; n <= 100;) {
			try {
				Thread.sleep((int)(Math.random() * 100) + 100);
			} catch(InterruptedException e) {}
			n += (int)(Math.random() * 10) + 1;
			if(n > 100) break;
			System.out.println(getName() + " 현재 위치 : " + n + "m - 야옹~");
		}
		System.out.println(getName() + "가 결승선을 통화했습니다. 야옹~");
	}
}
public class AnimalRacingTest {
	public static void main(String[] ar) {
		Dog dog = new Dog("은하");
		Cat cat = new Cat("신비");
		
		Thread dogThread = new Thread(dog);
		Thread catThread = new Thread(cat);
			//Runnable 인터페이스를 구현한 클래스는 run() 외의 메소드를 사용할 수 없으므로
			// Thread 클래스에 생성한 객체를 매개변수로 넣고 다시 객체를 생성해 줌.
//		dogThread.setDaemon(true);
//		catThread.setDaemon(true);
			// 데몬 스레드 : main() 메서드가 종료되는 시점에 스레드의 나머지 실행여부와 상관 없이 스레드를 종료시킴
			// 여기서는 데몬 스레드 지정 시 시작과 동시에 종료되는데 main() 메서드의 남아있는 내용부가 더 이상 없기 때문.
		System.out.println("은하와 신비 경주 시작---!!!");
		dogThread.start();
		catThread.start();
	}
}
