import java.util.Scanner;
public class FinallyTest {
	private static final Scanner in = new Scanner(System.in);
	public static void input() {
		int age = 0;
		try {
			System.out.print("나이 = ");
			age = Integer.parseInt(in.nextLine());			
		} catch(NumberFormatException ex) {
			System.out.println("오류 발생 = " + ex.getLocalizedMessage());
			return;	// 예외가 발생하면 오류 메세지와 finally 구문 수행 후 main() 메서드로 돌아감.
		} finally {
			System.out.printf("나이 = %d세\n", age);
		}
	}	
	public static void main(String[] ar) {
		System.out.println("Main Method Start");
		input();
		System.out.println("Main Method End");
	}
}
