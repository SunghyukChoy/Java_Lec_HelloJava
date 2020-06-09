
public class MyPoint {
	int xpos;
	int ypos;
	public MyPoint() {
		xpos = 0;
		ypos = 0;
		
	}
	public MyPoint(int pos) {
		xpos = pos;
		ypos = pos;
		
	}
	public MyPoint(int x,int y) {
		xpos = x;   // 이 코드는 this(x)와 동일함. 매개변수 값을 하나만 갖는
					// MyPoint(int pos)메소드가 실행되어 전달받은 x의 값이
					// xpos, ypos값으로 대입됨.
		ypos = y;	// 이후 전달받은 y의 값이 ypos로 대입됨.
		
	}
	public void display() {
		System.out.println("xpos = " + xpos + ", ypos = " + ypos);
	}
}
