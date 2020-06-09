import java.io.IOException;
public class IOExceptionTest {
	public static void main(String[] ar) {
		int key = 0;
		
		try {	// 예외 발생 예상 구역
			System.out.print("키보트  = ");
			key = System.in.read() - 48;			
		} catch(IOException ex) {// 예외처리 구역	// IOException 클래스의 객체 생성.
			System.err.println("오류 발생 = " + ex.getMessage());	
								//IOException 클래스의 getMessage() 메소드 호출
		} finally {	// 항상 실행
			System.out.printf("입력한 키의 아스키 값은 %d입니다\n", key);
		}
	}
}
