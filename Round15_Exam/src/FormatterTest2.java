import java.util.*;
import java.text.*;
public class FormatterTest2 {
	public static void main(String[] ar) {
		Calendar ca = GregorianCalendar.getInstance();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String result = fm.format(ca.getTime()); 
		System.out.println("result = " + result);
		// 포맷터를 사용하여 날짜 표기 쉽게 할 수 있음.
		
		double money = 12334234.5678;
		DecimalFormat df = new DecimalFormat("0,000.00");
		// 세 자리마다 콤마를 찍고(,000) 유효한 소수점 이하 두 자리(.##) 수까지 나타내라. 소수점 이하 두 자리는 (.00) 
		result = df.format(money);
		System.out.println("result = " + result);
		// 숫자를 원하는 포맷으로 변환하여 사용.
		
	}
}
