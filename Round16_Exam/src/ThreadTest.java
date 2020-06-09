class MyThread extends Thread {	// Thread 클래스를 상속 받아 쓰레드 생성
	public void run() {	// 메인 클래스에서의 main() 메서드. 내용부.
		for(int i = 0; i < 10; i++) {
			try {	// sleep() 메소드 실행 시 예외가 발생할 수 있기 때문에.
				Thread.sleep(100);	// 시간지연 메서드. 100 밀리세컨드. 0.1초.
			}catch(Exception e) {
				
			}
			System.out.println("MyThread = " + i);
		}
	}	
}
public class ThreadTest {
	public static void main(String[] ar) {
		MyThread mt = new MyThread();
		
		System.out.println("프로그램 시작");
		mt.run();
		System.out.println("프로그램 종료");
		// 실행순서: "프로그램 시작" -> run() 메소드 실행 -> "프로그램 종료". 순차적으로 실행.
		
		System.out.println("프로그램 시작 2");
		mt.start();	// start() 메소드 실행 시 main() 메스드의 실행과 별개로 동시에 실행.
					// '쓰레드 시작해' 하고 계속 진행.
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				
			}	System.out.println("Main = " + i);
		}
		System.out.println("프로그램 종료 2");
		// 실행순서 : "프로그램 시작 2" -> run()과 main() 메소드의 동시 실행. 
		//		 : 순간에 cpu를 점유하는 메소드가 실행. -> "프로그램 종료 2" 
	}
}
