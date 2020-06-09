package test.bbc;

public class RestrictTest {
	private class First {}
	// 외부에서 접근할 수 없음 접근제한자. 자기 자신의 내부에서만 사용 가능.
	private int x = 100;
	protected int y = 200;
	// protected int x = 100;
	int z = 300;
	// 앞에 아무것도 적지 않은 것은 package 타입.
	public int zz = 400;
	// 아무 곳에서나 쓸 수 있음.
	
	protected void display() { 
		System.out.println("y = " + y + ", z = " + z);
		System.out.println("x = " + x);
	}
	
	public void test() {
		First f = new First();
		System.out.println("x = " + x);		
		display();
	
	}
}
