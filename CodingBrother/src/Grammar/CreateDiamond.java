package Grammar;

public class CreateDiamond {
	public static void main(String[] ar) {
		
		int k = 1;
		for (int i = 0; i < 3; i++, k = k + 2) {
			System.out.println("");

			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int m = 0; m < k; m++) {
				System.out.print("*");
			}
		}
		
		int n = 1;
		for (int i = 1; i < 3; i++, n = n + 2) {
			System.out.println("");
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int m = 3; m >= n; m--) {
				System.out.print("*");
			}
		}
	}
}
