
public class OperationTest_02 {
	public static void main(String[] args) {
		int x = 5;
		int y = x++;
		
		/* ++x 를 늘려놓으면
		 * int x = 5;
		 * x = x + 1;	// x = 6
		 * int y = x;	// y = 6, x = 6		
		 */
		
		/* x++ 을 늘려놓으면
		 * int x = 5;
		 * int y = x;	// y = 5, x = 5
		 * x = x + 1;	// x = 6
		 */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
