import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] ar) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 a를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("a"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}
