
public class ForTest2 {
	public static void main(String[] ar) {
		for (int x = 5; x >= 1; --x) {
			for (int y = 1; y <= x; ++y) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("End");

	}

}
