import java.sql.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaTextFormatTest {
	public static void main(String[] ar) {
		Calendar ca = Calendar.getInstance();
						// Calendar는 추상클래스이므로 new 연산자로 객체 생성 불가. 위와 같이 객체를 생성한다.
		SimpleDateFormat dateformat = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초 SSS");
		System.out.println("지금 = " + dateformat.format(ca.getTime()));
		
		double data = 54321.78987;
		DecimalFormat df = new DecimalFormat("-0,000.###");
							// - : 음수기호. 0,000 : 세 자리마다 콤마 표시. .### : 소수점 아래 세 자리까지 표시.(제외 가능한 0은 제외.)
		System.out.println("54321.78987 = " + df.format(data));		
	}
}
