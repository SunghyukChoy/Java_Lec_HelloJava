// 전혀 모름. 
class Thread_01 extends Thread {
	private String name;
	public Thread_01(ThreadGroup tg, String str) {
		super(tg, str);
		this.name = str;
	}
	public void run() {
		System.out.println("Thread_01 = " + name);
	}	
}
class Thread_02 extends Thread {
	private String name;
	public Thread_02(ThreadGroup tg, String str) {
		super(tg, str);
		this.name = str;
	}
	public void run() {
		System.out.println("Thread_02 = " + name);
	}
}
public class ThreadGroupTest {
	public static void main(String[] ar) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		ThreadGroup alpha = new ThreadGroup(mainGroup, "alpha");
		ThreadGroup beta = new ThreadGroup(mainGroup, "beta");
		
		alpha.setDaemon(true);
		beta.setMaxPriority(Thread.MIN_PRIORITY);
		
		Thread_01 t1 = new Thread_01(alpha, "First");
		Thread_01 t2 = new Thread_01(alpha, "Second");
		Thread_01 t3 = new Thread_01(alpha, "Third");
		Thread_02 t4 = new Thread_02(beta, "Fourth");
		Thread_02 t5 = new Thread_02(beta, "Fifth");
		Thread_02 t6 = new Thread_02(beta, "Sixth");
					
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		mainGroup.list();
	}
}
