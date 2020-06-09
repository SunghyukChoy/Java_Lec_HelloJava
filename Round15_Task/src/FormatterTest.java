import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
public class FormatterTest {
	public static void main(String[] ar) {
		Formatter fm = new Formatter();
		Calendar ca = Calendar.getInstance();
		
		fm.format("논리형 %B와 %b\n", true, false);	// \n == %n
		fm.format("정수형 %d과 %o와 %x%n", 10, 10, 10);
		fm.format("실수형 %f와 %.2f%n", 12.345, 12.345);
		fm.format("문자열 %s%n", "Hello Java");
		fm.format("날짜형 %tY년 %tm월 %te일 %tA%n", ca, ca, ca, ca);
		fm.format("시간형 %tk시 %tM분 %tS초%n%n", ca, ca, ca);
		
		fm.format(Locale.KOREA, "한국 월 = %tB%n", ca);
		fm.format(Locale.JAPAN, "일본 월 = %tB%n", ca);
		fm.format(Locale.CHINA, "중국 울 = %tB%n", ca);
		fm.format(Locale.US, "미국 월  = %tB%n", ca);
		
		System.out.println(fm);
			
	}
}
