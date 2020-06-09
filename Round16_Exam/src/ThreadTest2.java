class MyThread2 extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				
			}
			System.out.println("MyThread 2 = " + i);
		}
	}
}
class MyThread3 implements Runnable { //다른 class를 상속받는 경우 Thread class 상속 불가능하므로 Runnable 인터페이스 상속. 
									// 인터페이스는 순수 디자인 목적의 클래스. start() 메소드 없음.			
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);				
			} catch(Exception e) {
				
			}
			System.out.println("MyThread 3 = " + i);
		}
	}
}
public class ThreadTest2 {
	public static void main(String[] ar) {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		
		MyThread3 mt3 = new MyThread3();
//		mt3.start();	//start() 메소드 없음.
		
		Thread mt = new Thread(mt3); // Thread 클래스의 도움을 받음.
		mt.start();		
	}
}
