class FirstThread extends Thread {
	public void run() {
		for(int n = 1; n < 10; n++) {
			for(int m = 0; m < 10000000; m++) {
				System.out.println("First(" + n + ")\t");
				if(m % 5 == 0) {
					System.out.println();
				} 
				else {
					System.out.flush();
				}
			}
		}
	}
}
class SecondThread extends Thread {
	public void run() {
		for(int n = 1; n < 10000000; n++) {
			for(int m = 0; m < 10; m++) {
				System.out.println("Second(" + n + ")\t");
				if(m % 5 == 0) {
					System.out.println();
				} else {
					System.out.flush();					
				}					
			}
		}
	}
}
public class ThreadPriorityTest {
	public static void main(String[] ar) {
		FirstThread fth = new FirstThread();
		SecondThread sth = new SecondThread();
		
		fth.setPriority(Thread.MAX_PRIORITY);
		sth.setPriority(Thread.MIN_PRIORITY);
		
		fth.start();
		sth.start();
	}
}
