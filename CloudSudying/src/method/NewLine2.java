package method;

public class NewLine2 {
	public static void oneLine() {
		System.out.println("<");
	}

	public static void threeLines() {
		oneLine();
		oneLine();
		oneLine();

	}

	public static void main(String[] ar) {
		System.out.println("Line1");
		threeLines();
		System.out.println("Line2");
	}
}
