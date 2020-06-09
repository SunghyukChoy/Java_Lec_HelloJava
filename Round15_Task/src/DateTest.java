import java.util.Date;
public class DateTest {
	public static void main(String[] ar) {
		Date da = new Date();
		
		System.out.println("연도 = " + (1900 + da.getYear()));
		System.out.println("월 = " + (1 + da.getMonth()));
		System.out.println("일 = " + da.getDate());
		System.out.println("시 = " + da.getHours());
		System.out.println("분 = " + da.getMinutes());
		System.out.println("초 = " + da.getSeconds());
	}
}
