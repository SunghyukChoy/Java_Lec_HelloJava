public class ThreadAPITest {
	public static void main(String[] ar) {
		int threadCount = Thread.activeCount();	// 현재 실행 중인 스레드 갯수.
		System.out.println("Thread total count = " + threadCount);
		Thread currentThread = Thread.currentThread(); // 햔제 실행 중인 스레드. 여기서는 main() 스레드. 
		System.out.println("current Thread = " + currentThread);
		System.out.println("name = " + currentThread.getName());
		System.out.println("priority = " + currentThread.getPriority());
		System.out.println("isAlive = " + currentThread.isAlive());
		System.out.println("isDaemon = " + currentThread.isDaemon());		
	}
}
