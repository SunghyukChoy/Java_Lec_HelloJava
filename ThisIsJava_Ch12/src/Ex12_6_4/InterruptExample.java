package Ex12_6_4;

public class InterruptExample {
	public static void main(String[] ar) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		thread.interrupt();
	}
}