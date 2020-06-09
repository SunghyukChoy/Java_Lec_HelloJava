// 이해 안 됨.
class Sync implements Runnable {
	public synchronized void syncTest_01() {
		String threadName = Thread.currentThread().getName();
		System.out.println("syncTest_01 Method Start!!!");
		for (int n = 1; n <= 5; n++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {	}
			System.out.println(threadName + " --> " + n + "\t");
			System.out.flush();
		}
		System.out.println("\nsyncTest_01 Method End!!!");
	}
	public void syncTest_02() {
		String threadName = Thread.currentThread().getName();
		System.out.println("syncTest_02 Method Start!!!");
		synchronized(this) {
			for (int n = 1; n <= 5; n++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {	}
				System.out.println(threadName + " --> " + n + "\t");
				System.out.flush();
			}
		}
		System.out.println("syncTest_02 Method End!!!");
	}
	public void syncTest_03(Integer x) {
		String threadName = Thread.currentThread().getName();
		System.out.println("syncTest_03 Method Start!!!");
		synchronized(x) {
			for(int n = 1; n < 5; n++) {
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {	}
				System.out.println(threadName + " --> " + n + "\t");
				System.out.flush();
			}
		}
		System.out.println("syncTest_03 Method End!!!");
	}
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "Thread Start!!!");
		syncTest_01();
		// syncTest_02();
		// syncTest_03(5);
	}
}
public class SyncronizedTeset {
	public static void main(String[] ar) {
		Sync sc = new Sync();
		Thread th_01 = new Thread(sc, "First");
		Thread th_02 = new Thread(sc, "Second");
		
		th_01.start();
		th_02.start();
	}
}
