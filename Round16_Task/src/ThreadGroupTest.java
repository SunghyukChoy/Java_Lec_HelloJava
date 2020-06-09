// 모름.
class Thread_01 extends Thread {
	public Thread_01(ThreadGroup tg, String name) {
		super(tg, name);
	}	
	public void run() {
		System.out.println("Thread_01!!");
	}
}
class Thread_02 extends Thread {
	public Thread_02(ThreadGroup tg, String name) {
		super(tg, name);
	}	
	public void run() {
		System.out.println("Thread_02!!");
	}
}
public class ThreadGroupTest {
	public static void main(String[] ar) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		ThreadGroup alpha = new ThreadGroup(mainGroup, "alpha");
		ThreadGroup beta = new ThreadGroup(mainGroup, "beta");
		
		alpha.setDaemon(true);
		beta.setMaxPriority(3);
		
		Thread_01 thread_01_01 = new Thread_01(alpha, "first");
		Thread_01 thread_01_02 = new Thread_01(alpha, "second");
		Thread_02 thread_02_01 = new Thread_02(beta, "third");
		
		thread_01_01.start();
		thread_01_02.start();
		thread_02_01.start();
		
		mainGroup.list();
	}
}
