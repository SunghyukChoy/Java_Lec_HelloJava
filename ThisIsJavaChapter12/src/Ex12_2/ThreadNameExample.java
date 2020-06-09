package Ex12_2;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		// Thread는 자체적인 이름이 있음. 작업 스레드의 이름을 setName() 메소드로 이름 설정하지 않으면
		// 자동적으로 thread-n 으로 설정된다
		threadB.start();
		

	}

}
