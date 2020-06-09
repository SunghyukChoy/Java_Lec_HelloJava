import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeTest {
	public static void main(String[] ar) {
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = ZonedDateTime.now(zid);
		
		System.out.println("연도 = " + zdt.getYear());
		System.out.println("월 = " + zdt.getMonthValue());
		System.out.println("일 = " + zdt.getDayOfMonth());
		System.out.println("시 =" + zdt.getHour());
		System.out.println("분 = " + zdt.getMinute());
		System.out.println("초 = " + zdt.getSecond());
		
		System.out.println("지금부터 3일 후면?");
		ZonedDateTime zdtafter = zdt.plusDays(3);
		System.out.println("월 = " + zdtafter.getMonthValue());
		System.out.println("일 = " + zdtafter.getDayOfMonth());
	}
}
