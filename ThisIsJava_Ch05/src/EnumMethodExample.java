
public class EnumMethodExample {
	public static void main(String[] ar) {
		//name() 메소드
		Week today = Week.Sunday;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.Monday;
		Week day2 = Week.Wednsday;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		
	
		//valueOf() 메소드
		Week weekDay = Week.valueOf("Sunday");
		if(weekDay == Week.Saturday || weekDay == Week.Sunday) {
			System.out.println("주말이군요.");				
		} else {
			System.out.println("평일이군요.");
		}
		
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
