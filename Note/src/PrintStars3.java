
public class PrintStars3 {

	public static void main(String[] args) {
		
		int val = 7;
		
//		printStar1(val);
//		System.out.println();		
//		printStar2(val);
//		System.out.println();
//		printStar3(val);
//		System.out.println();
//		printStar4(val);
//		System.out.println();
		printStar5(val);
		printStar6(val - 1);
	}

	/**
	 * ***
	 *  **
	 *   *
	 */
	private static void printStar4(int val) {
		
		for (int i = 0; i < val; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = val; j > i; j--) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		
	}

	/**
	 *   *
	 *  **
	 * ***
	 */
	private static void printStar3(int val) {
		
		for (int i = 0; i < val; i++) {
			for (int j = val - 1; j > i; j--) {
				System.out.print(' ');
			}
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	/**
	 * ***
	 * **
	 * *
	 */
	private static void printStar2(int val) {
		
		for (int i = 0; i < val; i++) {
			for (int j = val; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	/**
	 * *
	 * **
	 * ***
	 */
	private static void printStar1(int val) {
		
		for (int i = 0; i < val ; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
	/**
	 *   *
	 *  ***
	 * *****
	 */
	public static void printStar5(int val) {
				
		for (int i = 0; i < val; i++) {
			for (int j = val - 1; j > i; j--) {
				System.out.print(' ');
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print('*');
			}			
			System.out.println();
		}
	}
	
	public static void printStar6(int val) {
		
		for (int i = 0; i < val; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(' ');
			}
			for (int j = val * 2 - i - 1; j > i; j--) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}