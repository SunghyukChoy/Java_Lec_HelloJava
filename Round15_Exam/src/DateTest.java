import java.util.*;
public class DateTest {
	public static void main(String[] ar) {
		Date date = new Date();
		// 현재날짜 : 2019년 10월 25일
		System.out.println("year = " + (1900 + date.getYear()));	// getYear에 줄 간 거 : 쓰지 말자라는 뜻. deprecated.
						// 출력결과 : 119. 처음엔 두 자릿수만 관리하던 거라서.. +1900 해주면 정상 출력
		System.out.println("month = " + ( 1+ date.getMonth()));
						// 출력결과 : 9. 0부터 시작하는 배열이라서.. +1 해주면 정상출력
		System.out.println("day = " + date.getDate());
						// getDay : 주의 몇번째 날이냐.. 금요일이면 5.
						// getDate : 달의 날짜. 25 출력
		System.out.println("hour = " + date.getHours());
		System.out.println("minute = " + date.getMinutes());
		System.out.println("second = " + date.getSeconds());
		
		System.out.println("=============================");
		
		Calendar ca = GregorianCalendar.getInstance();
						// new 생성자 없음. 매개변수로 시간이나 지역 설정 가능. 미설정 시 윈도우 내 정보 사용.
		System.out.println("Year = " + ca.get(Calendar.YEAR));
		System.out.println("month = " + (1 + ca.get(Calendar.MONTH)));
									// Calendar 클래스도 배열이라서 +1 해줌.
		System.out.println("day = " + ca.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour = " + ca.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute = " + ca.get(Calendar.MINUTE));
		System.out.println("second = " + ca.get(Calendar.SECOND));
	}	
}
