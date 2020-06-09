
public class WhileKeyControlExample {
	public static void main(String[] ar) throws Exception {
		boolean run = true;		//상태변수
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------");			
				System.out.println("1. 종속 | 2. 감속 | 3. 중지");
				System.out.println("----------------------");
				System.out.println("선택: ");				
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {	// 1을 읽었을 경우	//49는 숫자'1'의 키코드 값. 1 입력 시 아스키 코드값 49로 변환됨.
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 50) {	// 2를 읽었을 경우
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 51) {	// 3을 읽었을 경우		// 무한반복을 피하기 위한 제어문
				run = false;
			}
		
		}
		System.out.println("포르그램 종료");
	}

}
