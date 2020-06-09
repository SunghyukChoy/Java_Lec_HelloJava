class Super_01 {
	private int x;
	private int y;
	public Super_01() {
		super();	// Object 클래스의 default 생성자 메서드 호출
		this.x = 10;
		this.y = 20;
	}
	public Super_01(int x) {
		this();		// Super_01() 생성자 메서드 호출
		this.x = x;		
	}
	public Super_01(int x, int y) {
		this(x);	// Super_01(int x) 생성자 메서드 호출
		this.y = y;
	}	
}
class Sub_01 extends Super_01 {
	private int r;
	public Sub_01() {
		super();	// Super_01() 생성자 메서드 호출
		this.r = 30;
	}
	public Sub_01(int x) {
		super(x);	// Super_01(int x) 생성자 메서드 호출
		this.r = 30;
	}
	public Sub_01(int x, int y) {
		super(x, y); // Super_01(int x, int y) 생성자 메서드 호출
		this.r = 30;
	}
	public Sub_01(int x, int y, int r) {
		this(x, y);	//	Sub_01(int x, int y) 생성자 메서드 호출
		this.r = r;
	}
}
public class SuperMethodTest {
	public static void main(String[] ar) {
		Sub_01 sb = new Sub_01();				// x = 10, y = 20, r = 30
		Sub_01 sb1 = new Sub_01(50);			// x = 50, y = 20, r = 30
		Sub_01 sb2 = new Sub_01(50, 80);		// x = 50, y = 80, r = 30
		Sub_01 sb3 = new Sub_01(50, 80, 120);	// x = 50, y = 80, r = 120		
				
	}
	
}
