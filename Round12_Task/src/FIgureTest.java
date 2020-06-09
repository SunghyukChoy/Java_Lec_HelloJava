import java.util.Scanner;
class MyPoint {
	protected static Scanner in;
	static {
		// 0. 최초 MyPoint 가 로드될 때 입력을 받기 위해 Scanner 객체 초기화
		in = new Scanner(System.in);
	}
	private int x;
	private int y;
	protected MyPoint() {
		// 3. 실제로 실행되서 x,y 좌표값 받음
		System.out.print("점 x = ");
		this.x = in.nextInt();
		System.out.print("점 y = ");
		this.y = in.nextInt();
	}
	protected void display() {
		System.out.printf("점(x, y) = (%d, %d)\n", this.x, this.y);
	}
}
class Circle extends MyPoint {
	private int r;
	public Circle() {		// super() 메서드가 생략되어 있음
		// 2. 진입 전에 MyPoint를 상속받았으므로, MyPoint 생성자 부분이 먼저 실행
		// 4. 이 지점에 이미 x,y 값 받음
		System.out.print("반지름 r = ");
		this.r = in.nextInt();
		// 5. 반지름 받고 종료, 생성자 다음 줄로 이동
	}
	public void display() {
		
		super.display();
		System.out.printf("반지름 r = %d\n", this.r);
	}
}
class Rect extends MyPoint {
	private int w;
	private int h;
	public Rect() {			// super() 메서드가 생략되어 있음
		System.out.print("폭 w = ");
		this.w = in.nextInt();
		System.out.print("높이 h = ");
		this.h = in.nextInt();
	}
	public void display() {
		super.display();
		System.out.printf("폭 w : %d, 높이 h : %d", this.w, this.h);
	}
}
public class FIgureTest {
	public static void main(String[] ar) {
		Circle circle = new Circle();	// 1. start, Circle 생성자 진입
		circle.display();	// 6. x,y,반지름 결과 출력
		System.out.println();
		Rect rect = new Rect();	// 7. rect 생성 시작, 마찬가지로 Rect 생성자 진입
		rect.display();
	}
}
