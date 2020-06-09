// 이해 안 됨.
class DeadLock implements Runnable {
	public synchronized void firstMethod(int x) {
		for(int n = 1; n <= 5; n++) {
			System.out.printf(Thread.currentThread().getName() + " --> " 
					+ n + "\t");
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
		}
		System.out.println();
		try {
			this.wait();
		} catch(InterruptedException e) {}
		if(x == 1) secondMethod(2);
	}
	public synchronized void secondMethod(int x) {
		for(int n = 6; n <= 10; n++) {
			System.out.println(Thread.currentThread().getName() + " --> " 
					+ n + "\t");
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
		}
		System.out.println();
		notifyAll();
		if(x == 1) firstMethod(2);
	}	
	public void run() {
		int x = (int)(Math.random() * 2);
		if(x % 2 == 0) firstMethod(2);
		else secondMethod(2);
	}
}
public class DeadLockTest {
	public static void main(String[] ar) {
		DeadLock dl = new DeadLock();
		
		Thread th_01 = new Thread(dl);
		Thread th_02 = new Thread(dl);
		
		th_01.start();
		th_02.start();
	}
}
