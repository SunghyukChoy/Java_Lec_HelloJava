package Ex12_2;

import java.awt.*;

//메인 스레드만 사용 -> 비프음 발생 후 화면 출력
public class BeepPrintExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 가져오기

		for (int i = 0; i < 5; i++) {

			toolkit.beep(); // 비프음 발생

			try {
				Thread.sleep(500); // 0.5초 일시정지
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 5; i++) {

			System.out.println("띵");

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
