//parseInt(in.nextInt()) 넣어서 Scanner 클래스가 알아서 예외처리 하는지 확인해보기 교재 434p 확인
// 실수 넣었을 떄 예외 메세지 안 나오게 하기
//parseInt가 뭐더라..
import java.util.Scanner;
public class InputExceptionTest {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int x = 0, y = 0, tot = 0;
		boolean bool = false;
		
		do {
			bool = false;
			System.out.print("x = ");
			try {
				x = Integer.parseInt(in.nextLine());
					// (in.nextInt()) 작성 후 문자를 넣으면 Scanner 클래스의 자체적인 예외처리를 실행되므로 
					// 우리가 작성한 예외처리 블록이 실행되지 않게 된다. 교재 434p
			} catch(NumberFormatException ex) {
				System.out.println("x는 숫자여야 합니다");
				bool = true;
			}
		} while(bool);
		
		do {
			bool = false;
			System.out.print("y = ");
			try {
				y = Integer.parseInt(in.nextLine());
			} catch(NumberFormatException ex) {
				System.out.println("y는 숫자여야 합니다");
				bool = true;
			} 
		} while(bool);
		
		try {
			tot = x / y;
		} catch(ArithmeticException ex) {
			System.out.println("정수연산에서 0으로 나눌 수 없습니다.");
			tot = -1;
		} finally {
			System.out.printf("%d / %d = %d", x, y, tot);
		}
		
		in.close();
	}
}
