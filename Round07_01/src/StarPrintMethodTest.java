
public class StarPrintMethodTest {
	public static void X() {
		for (int n = 0; n < 10; n++) {
			System.out.print("*");
		}
		return; // 결과형 반환값이 void일 경우 return만 적거나 생략.
	}

	public static void main(String[] ar) {
		X();
		System.out.println("\nHello");
		X();
		System.out.println("\nJava");
		X();
		System.out.println("\nWorld");
		return; // main() 메소드도 원래는 return이 있어야 하지만 생략할 수 있다.
	}
}
