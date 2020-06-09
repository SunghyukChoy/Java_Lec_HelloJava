class OtherThread extends Thread {
	public OtherThread(String name) {
		super(name);
	}	
	public void run() {
		System.out.println("\n" + this.getName() + "- Start!!!");
		for(char ch = 'A'; ch<= 'Z'; ch++) {
			try {
				Thread.sleep(350);
			} catch(InterruptedException e) {}
			System.out.printf("%c\t", ch);
			System.out.flush();
		}
		System.out.println("\n" + this.getName() + "- End!!!");
	}
}
public class ThreadExtendsTest {
	public static void main(String[] ar) {
		System.out.println("Main Thread Start!!!");
		
		OtherThread ot = new OtherThread("Alphabet Thread!");
		ot.start();

		for(int n = 0; n <= 100; n++) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
			System.out.println(n + "\t");
			System.out.flush();
			if(n % 7 == 0) System.out.println();
		}
		
		System.out.println("\nMain Thread End!");
	}
}
