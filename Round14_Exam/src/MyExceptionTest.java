import java.util.Scanner;

public class MyExceptionTest {
	public static void input() throws MyException {	// 사용자가 만든 MyException으로 던지겠다.
		Scanner in = new Scanner(System.in);
		System.out.println("국어 점수는 = ");
		int kor = in.nextInt();
		if (kor < 0 || kor > 100) {
			MyException me = new MyException();
			in.close();
			throw me;	// me를 던지겠다.
		}
		in.close();
	}	
	public static void main(String[] ar) {
		try {
			input();	// input() 메소드 실행시 예외 발생 예상 구역이므로 try로 묶어줌		
		} catch (MyException ex) {
							// ex는 객체명임. MyException 클래스의 객체 생성.
			System.err.println("message : " + ex.getLocalizedMessage());
											//MyException 클래스에서 재정의한 메서드
		} finally { // 안 적어도 상관 없음.
			System.out.println("프로그램 종료");
		}

	}
}
