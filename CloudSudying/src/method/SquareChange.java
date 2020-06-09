package method;

public class SquareChange {
	/*
	 * 흔히 실수할 수 있는 내용
	 * Call by value vs Call by Reference
	 */
	public static void main(String[] ar) {
		int x = 5;
		System.out.println("main x = " + x);
		printSquare(x);
		System.out.println("main x = " + x);
	}
	
	/* Call By Value 
	 * -> **기본형** 메서드 파라미터들은 값이 복사가 되서 원본에 영향을 미치지 않는다.
	 *    그래서 결과값이 원본 x에 영향을 주지 않는다. 
	 */
	public static void printSquare(int x) {
		System.out.println("printSquare x = " + x);
		x = x * x;
		System.out.println("printSquare x = " + x);		
	}
}
