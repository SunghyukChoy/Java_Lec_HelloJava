package Ex12_2;

import java.awt.Toolkit;

// 메인 스레드와 작업 스레드 동시 실행 -> 비프음과
public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
