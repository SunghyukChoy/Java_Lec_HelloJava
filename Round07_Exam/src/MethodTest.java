
public class MethodTest {
	public static void starPrint() {
		for (int i = 1; i <= 5; ++i) {
			System.out.print("*");
		}
		return;
	}
	public static void main(String[] ar) {
	
		starPrint(); 
		System.out.println("");
		System.out.print("work\n");
		starPrint();
		System.out.println("");
		System.out.print("Other work\n");
		starPrint();
		System.out.println("");
		System.out.print("Another work\n");
		starPrint();
	}
}
