import java.lang.*;
import java.util.Scanner;
public class WhileTest3 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int kor = 0;
		do {
			System.out.print("kor = ");
			kor = in.nextInt();
			
		} while (kor < 0 || kor > 100);
		System.out.println("kor : " + kor + "점입니다.");
		in.close();
			
	}
}
