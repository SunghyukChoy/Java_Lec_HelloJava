
public class Elevator {
	public static void main(String[] ar) {
		
		int a = 12;
		int b = 6;
		int c = 18;

		System.out.printf("%d층 -> %s\n", a, guide(a));
		System.out.printf("%d층 -> %s\n", a, guide(b));
		System.out.printf("%d층 -> %s\n", a, guide(c));
	}
	public static String guide (int floor) {
		
		return (floor > 10) ? "고층" : "저층";
		
				
	}
}
