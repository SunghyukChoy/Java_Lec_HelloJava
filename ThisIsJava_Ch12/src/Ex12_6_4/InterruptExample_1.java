package Ex12_6_4;

public class InterruptExample_1 {
	public static void main(String[] ar) {
		Thread thread_1 = new PrintThread2_1();
		thread_1.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		thread_1.interrupt();
	}
}
