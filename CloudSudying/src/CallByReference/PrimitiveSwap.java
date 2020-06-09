package CallByReference;


// call by value.
public class PrimitiveSwap {
	public static void main(String[] ar) {
		PrimitiveSwap ps = new PrimitiveSwap();
		
		int x = 10;
		int y = 20;
		
		System.out.println("\n호출 전 main x = " + x + " y = " + y);
		ps.change(x, y);
		System.out.println("\n호출 후 main x = " + x + " y = " + y);
		
	}
	void change(int x, int y) {
		System.out.print("\nBefore change x = " + x + " y = " + y);
		
		int temp = x;
		x = y;
		y = temp;

		System.out.println("\nAfter change x = " + x + " y = " + y);

	}
}
