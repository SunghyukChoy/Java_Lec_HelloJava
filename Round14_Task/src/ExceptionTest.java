import java.util.Scanner;
class ExceptionOccur {
	private static Scanner in;
	static {
		in = new Scanner(System.in);
	}
	private int kor;
	
	public void input() throws IndexOutOfBoundsException {	// 예외전가
		System.out.println("국어 점수 = ");
		kor = in.nextInt();
		if(kor < 0 || kor > 100) {
			throw new IndexOutOfBoundsException("0~100점만 입력 가능");	// 예외 발생시킴. 위로 던져줌.
		}
	}
	public void output() {
		System.out.printf("국어 점수는 %d점입니다.\n", kor);
	}	
}
public class ExceptionTest {
	public static void main(String[] ar) throws IndexOutOfBoundsException {	//예외 발생 가능 메소드를 생성하므로 여기서도 예외전가
		ExceptionOccur eo = new ExceptionOccur();
		eo.input();
		eo.output();
	}
}
