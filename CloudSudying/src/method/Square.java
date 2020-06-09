package method;

public class Square {
	public static void printSquare(int x) {
		System.out.println(x * x);

	}

	public static void main(String[] ar) {
		int value = 2;
		printSquare(value);
		printSquare(3);
		printSquare(value * 2);
		cube(10);
	}

	public static void cube(int y) {
		System.out.println(y * y * y); 
	}

}
