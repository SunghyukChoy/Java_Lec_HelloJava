package Ex12_6_123;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] ar) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
		}
	}
}
