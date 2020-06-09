import java.util.Scanner;

public class SwitchControlTest_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		byte jumin_07 = -1; // 음수는 주민번호에 없을 것이므로 음수로 초기화
		short year = 0; // 태어는 연도를 저장할 공간
		String gender = ""; // 성별을 저장할 공간

		System.out.print("주민번호 7번째 자리 = ");
		jumin_07 = in.nextByte();
		/* switch 문은 정수형 보다는 열거형(enum) 으로 많이 사용됨 */
//		switch(jumin_07) {
//			case 9: 
//			case 0: 
//				year = 1000; 
//				break;
//			case 1: 
//			case 2: 
//				year = 1900; 
//				break;
//			case 3: 
//			case 4: 
//				year = 2000; 
//				break;
//			default: 
//				year = -2;
//		}

		if (jumin_07 == 9 || jumin_07 == 0) {
			year = 1000;
		} else if (jumin_07 == 1 || jumin_07 == 2) {
			year = 1900;
		} else if (jumin_07 == 3 || jumin_07 == 4) {
			year = 2000;
		} else {
			year = -1;
		}

		if (year != -1) {
			gender = jumin_07 % 2 == 0 ? "여성" : "남성";
		}

		in.close();

		// year 는 -1 값이 들어올 수가 없으므로, 들어올 시 사용자에게 오류 메시지를 출력한다
		if (year == -1) {
			System.out.println("잘못된 입력을 하셨습니다. 숫자는 0, 1, 2, 3, 4 만 입력 가능합니다.");
		} else {
			// 정상적인 값 출력
			System.out.println();
			System.out.println("당신은 " + year + "년대 " + gender + "입니다. ");
		}
	}

}
