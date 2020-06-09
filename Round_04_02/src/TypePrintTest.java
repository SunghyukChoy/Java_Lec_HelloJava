
public class TypePrintTest {
	
	public static void main(String[] args) {
		// if, for, while 문에서 사용
		boolean boolType = true; // true �Ǵ� false
		
		// 문자열
		String message = "this is test";
		// 문자열 심화
		byte byteType = 100; // -128 ~ 127
		char charType = 'A'; // 0 ~ 65,535 : As�� 65
		
		// 정수
		int intType = 214783647;
		// -2,147,483,648 ~ 2,147,483,647
		int intType2 = Integer.MIN_VALUE;
		// Integer.MIN.VALUE ~ Interger.MAIN.VALUE;
		long longType = 12345; // -922�� ~ 922��
		short shortType = -32000; // -31.768 ~ 32.767
		
		// 실수
		float floatType = 175.45f; // 1.4E-45 ~ 3.402823E38
		double doubleType = 3.147657537337476543758;
		// 4.9E-324 ~ 1.8E388
		
		// 정수, 실수
		// 정수 쓸때는 int, 더 크면 long
		// 실수 쓸 때는 float, 더 크면 double
		// 문자쓸때는 쌍따옴표 찍고 String =>>> 개 심화 : 단 문자 단위 계산할때 char, byte 를 쓸때가 가끔 있음
		

		System.out.println("boolean = " + boolType);
		System.out.println("byte = " + byteType);
		System.out.println("char = " + charType);
		System.out.println("short = " + shortType);
		System.out.println("int = " + intType);
		System.out.println("int = " + intType2);
		System.out.println("long = " + longType);
		System.out.println("float = " + floatType);
		System.out.println("double = " + doubleType);

	}
}
