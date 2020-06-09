package CallByReference;

// call by reference.
public class RefSwap {
	int x;
	
	public static void main(String[] ar) {
		RefSwap rs = new RefSwap();
		rs.x = 10;
		
		System.out.print("main before calling x = " + rs.x);
		rs.change(rs);
		System.out.println("main after calling x = " + rs.x);
	}
	void change(RefSwap rs2) {
		System.out.print("\nBefore change x = " + rs2.x);
		rs2.x = 2000;
		System.out.println();
		System.out.println("\nAfter change x = " + rs2.x);
		

	}
}

	
