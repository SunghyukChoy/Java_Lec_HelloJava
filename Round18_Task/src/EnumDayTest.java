enum EnumDay2 {
	Sunday(0, "일"), Monday(1, "월"), Tuesday(2, "화"), Wednsday(3, "수"),
	Thursday(4, "목"), Friday(5, "금"), Saturday(6, "토");
	private int position;
	private String dayString;
	EnumDay2(int pos, String dayStr) {
		this.position = pos;
		this.dayString = dayStr;
	}
	public int getPosition() {
		return position;
	}
	public String getDayString() {
		return dayString;
	}
	public String toString() {
		return dayString + "요일(" + position + ")";
	}
	public static String afterDay(EnumDay2 eDay, int days) {
		int afterDay = eDay.getPosition() + days;
		int requestDay = afterDay % 7;
		for(EnumDay2 enumDay : EnumDay2.values()) {
			if(enumDay.getPosition() == requestDay) {
				return enumDay.toString();
			}
		}
		return "";
	}
}
public class EnumDayTest {
	public static void main(String[] ar) {
		EnumDay2 eDay = EnumDay2.Monday;
		
		String afterTen = EnumDay2.afterDay(eDay, 10);
		System.out.println("월요일의 10일 후는 " + afterTen);
	}
}
                         