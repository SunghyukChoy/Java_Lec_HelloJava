
public class BaseClass extends Object {
	private int x;
	int x2;
	private int y;
	protected int y2;
	BaseClass() {
		this.x = 0;
		this.y = 0;
	}
	BaseClass(int x, int y) {
		this();
		this.x = x;
		this.y = y;
	}
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}
