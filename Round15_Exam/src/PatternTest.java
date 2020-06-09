import java.util.regex.*;
public class PatternTest {
	public static void main(String[] ar) {
		Pattern pt = Pattern.compile("a[b-y]*z$");
		// a로 시작하고 중간엔 b-y 아무거나 들어가도 되고 z로 끝나는 문자열을 0개 이상(*) 찾겠다.
		// ex) abcz, aaz, abz, az
		
		Matcher m1 = pt.matcher("abcz");
		Matcher m2 = pt.matcher("aadz");
		Matcher m3 = pt.matcher("abcy");
		Matcher m4 = pt.matcher("a z");
		Matcher m5 = pt.matcher("bbcz");

		System.out.println("m1 = " + m1.matches());	// m1이 위의 조건에 맞는가?
		System.out.println("m2 = " + m2.matches());
		System.out.println("m3 = " + m3.matches());
		System.out.println("m4 = " + m4.matches());
		System.out.println("m5 = " + m5.matches());
	}
}
