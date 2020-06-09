// 당연히 모름.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
	private String name;
	public MyThread(String str) {
		this.name = str;
	}
	public void run() {
		for(int n = 0; n <= 5; n++) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
			System.out.println(name + " --> " + n + "\t");
			System.out.flush();
		}
		System.out.println();
	}
}
public class ThreadPoolTest {
	public static void main(String[] ar) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		Runnable[] runnable = new Runnable[] {
				new MyThread("First"), new MyThread("second"), 	new MyThread("third")
		};
		for(Runnable run: runnable) {
			exec.execute(run);
		}
	}
}