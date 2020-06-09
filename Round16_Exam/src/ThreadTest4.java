class MyThread5 implements Runnable {
	public void syncMethoid() {
//	public synchronized void syncMethoid() {
			// 공유된 객체에 대하 누군가 메소드에 접근 시 다른 것들은 접근하지 못하게  함.
		String name = Thread.currentThread().getName();
		System.out.println(name + "'s Thread Start");
		// 메소드 전체가 아닌 for 문 도는 동안에만 사용하고 싶다면..
		synchronized(this){	// 이 영역에서만 동기화
				// Second's Thread Start, First's Thread Start라는 문구까지는 순서 구분없이 출력되지만
				// for 문부터는 먼저 접근한 객체만이 출력된 후 다른 객체 출력.
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);				
				} catch(Exception e) {
					
				}
				System.out.println(name + " : " + i);
			}
		}
		System.out.println(name + "'s Thread End");
	}	
	public void run() {
		syncMethoid();
	}
}
public class ThreadTest4 {
	public static void main(String[] ar) {
		MyThread5 mt = new MyThread5();
		Thread m = new Thread(mt, "First");
		Thread m2 = new Thread(mt, "Second");
		
		m.start();
		m2.start();		
	}
}
