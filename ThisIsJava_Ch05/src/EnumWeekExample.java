import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] ar) {
		Week today = null;
		// instance : 실행 준비가 완료된 객체
			// 크림빵이 4개 있다 <-- 4개 객체
			// 결제 후 먹을 준비가 된 것 <-- instance
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
										//상수값
		switch(week) {
		case 1 :
			today = Week.Sunday; break;
		case 2 :
			today = Week.Monday; break;
		case 3 :
			today = Week.Tuesday; break;
		case 4 :
			today = Week.Wednsday; break;
		case 5 :
			today = Week.Thursday; break;
		case 6 :
			today = Week.Friday; break;
		case 7 : 
			today = Week.Saturday; break;			
		}
		
		System.out.println("오늘 요일 = " + today);
		
		if(today == Week.Sunday) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}