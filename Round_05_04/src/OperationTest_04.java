
public class OperationTest_04 {
	public static boolean aaa() {
		System.out.println("AAA");
		return false;
	}

	public static boolean bbb() {
		System.out.println("BBB");
		return true;
	}

	/********************** 개중요 꼭 외울것 (이거 모르면 조건문 if를 쓸수가 없고 개발을 할수가 없게되고 성혁이가 망하고 나라가 망함) **********************
	 * 2진법 계산의 기본
	 * AND (&&) OR (||)
	 * AND 계산들 (4가지)
	 * true && true = true
	 * true && false = false
	 * false && true = false
	 * false && false = false
	 * 즉 and는 하나라도 false면 false
	 * 
	 * OR 계산들 (4가지)
	 * true || true = true
	 * true || false = true
	 * false || true = true
	 * false || false = false
	 * or는 하나라도 true 면 true
	 * 
	 * 단 연산자 기호를 한개만 쓴 것들(&, |)은 양쪽 모두 계산한다
 	 */
	public static void main(String[] args) {
		boolean result = aaa() || bbb();
		System.out.println("result = " + result);
	}
}
