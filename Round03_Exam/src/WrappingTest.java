/* 기본 자료형을 boxing 하기 위해 사용
 * 기본 자료형을 대체하는 클래스로 기본 자료형의 객체화와 은닉화, 편의성을 위해 사용
 * 첫 글자가 대문자이며 이것으로 기본 자료형과 구분
 * 각 래퍼 클래스는 자료형의 최댓값,최솟값을 표현하는 필드를 가진다
 * 
 */
public class WrappingTest {
	public static void main(String[] ar) {
		byte aa = 100;
		Byte aa_01 = new Byte(aa);
		
		char bb = 'A';
		Character bb_01 = new Character(bb);
		
		short cc = 12345;
		Short cc_01 = new Short(cc); //boxing = 일반 자료형을 래퍼 클래스로 묶어 내는 것
		short cc_02 = cc_01.shortValue(); //unboxing = 다시 일반 자료형으로 빼내는 것
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		int dd = 2147483647;
		Integer dd_01 = new Integer(dd);
		int dd_02 = dd_01; // 위와 같이 .intValue();를 안 붙혀도 자동으로 unboxing이 됨. 자바 8버젼부터.
		Integer dd_03 = dd_02; // 다시 boxing 할 때 new Interger를 안 붙혀도 됨.
		
		long ee = 2147483647L; // L을 붙이지 않으면 int형이 되므로 붙여줌. 숫자 1과 혼동을 피해가 위해 대문자 L 사용.
		
		float ff = 13.34f; // float 자료형이라는 것을 알리기 위해 f를 반드시 붙혀줌. 
							//정수형에서 기본 자료형은 int, 실수형에서 기본 자료형은 double이므로 f를 붙이지 않을 시 double로 인식함. 
		Float ff_01 = new Float(ff); 
	}
}
