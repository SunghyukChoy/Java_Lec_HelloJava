
/* 토큰 : 문법적으로 더이상 나눌 수 없는 언어요소. 구분자로 나누어 더이상 나눌 수 없는 것들.
 * 구분자 : ',' ':' '-' ' ' 등. 토큰을 나누는 것들. 여러개 사용 가능.
 * ex) pm:05:12 구분자 : 라면 토큰은 'pm' '05' '12'
 * ex) 880204-111111 구분자 - 라면 토큰은 '880204' '111111'
 * */
import java.util.StringTokenizer;

public class TokenTest {
	public static void main(String[] ar) {
		String source = "a,b,c,d,e,,f";

		StringTokenizer stk = new StringTokenizer(source, ",");
		// source를 콤마 기준으로 잘라라. 여기서 구분자가 ','
		while (stk.hasMoreTokens()) { // 반환할 토큰들이 있는가?
			String token = stk.nextToken(); // 다음 토큰을 반환
			System.out.print(token + " : ");
			// ,,사이의 null 값을 무시. 출력하지 않음.
		}
		System.out.println("\n-----------------------");

		String[] arr = source.split(",");
		// source를 콤마 기준으로 split
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");
			// ,,사이의 null 값을 무시하지 않고 출력함
		}
		System.out.println("\n-----------------------");
		

		StringTokenizer token1 = new StringTokenizer("PM:05:12", ":");
															// 구분자 ':'
		while (token1.hasMoreTokens()) {
			System.out.print(token1.nextToken() + " ");
		}
		System.out.println("\n-----------------------");


		StringTokenizer token2 = new StringTokenizer("10 + 9 - 8 / 7 = 18", "+-/= ");
														//	구분자 '+' '-' '/' '=' ' '
		while (token2.hasMoreTokens()) {
			System.out.print(token2.nextToken() + " ");
		}

	}
}
