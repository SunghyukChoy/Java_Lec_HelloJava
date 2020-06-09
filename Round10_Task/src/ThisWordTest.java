
class ThisWord {
	private int x;
	private int y;
	
	public ThisWord() {
		x = 0;
		y = 0;
		
	}
	public ThisWord(int a, int b) {
		x = a;
		y = b;
	}
	
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class ThisWordTest {
	public static void main(String[] ar) {
		ThisWord tw = new ThisWord();
		ThisWord tw1 = new ThisWord(50, 60);
		ThisWord tw2 = new ThisWord(100, 200);
		
		
		tw.display();
		tw1.display();
		tw2.display();
	}
}

