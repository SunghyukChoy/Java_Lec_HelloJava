import java.util.*;

public class IfTest {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		System.out.print("first = ");
		int first = in.nextInt();
		System.out.print("second = ");
		int second = in.nextInt();
		
		if (first > second) {
			System.out.println("first 수가 큽니다");
		} else if (second > first) { 
			System.out.println("second 수가 큽니다");
		} else {
			System.out.println("두 수는 같습니다");
		}
		
		in.close();
		
	}	
}
