
public class MethodTest2 {
	// method overloading
	public static void starPrint() {
	/*	for (int i = 0; i <= 5; ++i) {
			System.out.print("*");
		}
		System.out.println();    */   
		// 아래쪽 코드와 너무 유사하므로 줄임
		starPrint(1);
		// 메인 메소드에서 지금의 메소드를 호출했을 때 여기서도 아래에 메소드를 호출할 수 있음.
	}
	// method overloading
	public static void starPrint(int n) { //위와 메서드 명이 같아도 매개변수가 다르므로 같은 메서드명을 사용할 수 있다.
		for (int i = 0; i < n; ++i) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] ar) {
		starPrint();
		System.out.println("work");
		starPrint();
		System.out.println("Other Work");
		starPrint();
		System.out.println("Another Work");
		starPrint(20);
	}
}
