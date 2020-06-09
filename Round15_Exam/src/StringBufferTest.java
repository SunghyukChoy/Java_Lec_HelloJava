
public class StringBufferTest {
	public static void main(String[] ar) {
		StringBuffer sbuff = new StringBuffer("abcd");
		System.out.println(sbuff);
		
		sbuff.replace(0, 2, "ffffffff");	// 0번쨰부터 2번째 위치까지 'ffffffff'로 바꿈.
				
//		sbuff = sbuff.replace(0, 2, "ffffffff");
			// String 클래스와 달리 이런 식의 대입을 하지 않아도 됨. 사용하여도 상관은 없음.
		System.out.println(sbuff);
	}
}
