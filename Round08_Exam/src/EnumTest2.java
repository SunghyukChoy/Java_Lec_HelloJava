
public class EnumTest2 {
	public static void main(String[] ar) {
		Season lastSeason = Season.winter;
		Season nowSeason = Season.spring;
		Season nextSeason = Season.summer;
		
		System.out.println("last = " + lastSeason);
		System.out.println("now = " + nowSeason);
		System.out.println("next = " + nextSeason);
		
		System.out.println("UPPER CASE = " + Season.AUTUMN);
	}
}
