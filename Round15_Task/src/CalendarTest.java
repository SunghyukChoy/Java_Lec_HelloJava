import java.util.Calendar;
import java.util.TimeZone;
public class CalendarTest {
	public static void main(String[] ar) {
		TimeZone timezone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar ca = Calendar.getInstance(timezone);
		
		System.out.println("연도 = " + ca.get(Calendar.YEAR));
		System.out.println("월 = " + (ca.get(Calendar.MONTH) + 1));
		System.out.println("일 = " + ca.get(Calendar.DAY_OF_MONTH));
		System.out.println("시  = " + ca.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 = " + ca.get(Calendar.MINUTE));
		System.out.println("초 = " + ca.get(Calendar.SECOND));
		
		System.out.println("지금부터 3일 후는?");
		ca.add(Calendar.DAY_OF_MONTH, 3);	// (계산에 원하는 필드, 계산에 사용할 값)
		System.out.println("월 = " + (ca.get(Calendar.MONTH) + 1));
		System.out.println("일 = " + ca.get(Calendar.DAY_OF_MONTH));
	}
}
