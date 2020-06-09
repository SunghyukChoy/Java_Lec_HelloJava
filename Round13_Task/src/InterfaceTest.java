interface MyInterface {
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}
public class InterfaceTest {
	public static void main(String[] ar) {
		// MyInterface mi = new MyInterface();		// 컴파일 오류
		// MyInterface w = 50;			// 컴파일 요류
		System.out.println("w = " + MyInterface.w);
		System.out.println("x = " + MyInterface.x);
		System.out.println("y = " + MyInterface.y);
		System.out.println("z = " + MyInterface.z);		
	}
}


