// 전혀 모름.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OneThread implements Runnable {
	private String name;
	public OneThread(String str) {
		this.name = str;
	}	
	public void run() {
		System.out.println("Thread = " + name);
	}
}
public class ThreadPoolTest {
	public static void main(String[] ar) {
		Runnable[] runnable = new Runnable[] {
		new OneThread("First"), new OneThread("Second"), new OneThread("Third")
		};
		
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < runnable.length; i++) {
		//	Thread th = new Thread(runnable[i]);	// 쓰레드 생성 시  많을 경우 부하 걸림
		//	th.start();
			exec.execute(runnable[i]);		// 부하 적음.
		}
	}
}
