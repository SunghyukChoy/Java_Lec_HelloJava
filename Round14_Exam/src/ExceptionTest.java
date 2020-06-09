
public class ExceptionTest {
	public static void aaa() throws Exception { // 예외 전가
		System.out.println("Test");
		// 만약 예외가 발생할 코드가 있다면? -> 예외 전가 or 예외 처리		
	}
	public static void bbb() throws Exception {
		aaa();
		// aaa();를 호출하면 예외가 발생할지도 모르는데? -> 여기서도 예외 전가
	}
	public static void ccc() throws Exception {
		bbb();
		// bbb();를 호출하면 예외가 발생할지도 모르는데? -> 여기서도 예외 전가

	}	
	public static void main(String[] ar) throws Exception {
		ccc();
		// ccc();를 호출하면 예외가 발생할지도 모르는데? -> 여기서도 예외 전가

	}
}
