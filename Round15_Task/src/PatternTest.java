// 주석처리 한 것 안 됨. 왜 안 되지?
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternTest {
	public static void main(String[] ar) {
		Pattern pt = Pattern.compile("^a[b-y]*z$");	
			//^a : a로 시작하는 문자열		//[b-y] : b에서 y 사이의 문자열 
			// * : 0개 이상			//z$ : z로 끝나는 문자열
//		Pattern pt2 = Pattern.compile("^a(java)*z$");
			//(xyz) : xyz라는 문자열을 하나의 그룹으로 사용.
		Matcher mch_01 = pt.matcher("abcd");
		Matcher mch_02 = pt.matcher("az");
		Matcher mch_03 = pt.matcher("abcz");
		Matcher mch_04 = pt.matcher("bcdz");
//		Matcher mch_05 = pt2.matcher("adfasdfajavaz");
//		Matcher mch_06 = pt2.matcher("adfefz");
		
		System.out.println("abcd = " + mch_01.matches());
		System.out.println("az = " + mch_02.matches());
		System.out.println("abcz = " + mch_03.matches());
		System.out.println("bcdz = " + mch_04.matches());
//		System.out.println("adfasdfajavaz = " + mch_05.matches());
//		System.out.println("adfefz = " + mch_06.matches());		
	}
}
