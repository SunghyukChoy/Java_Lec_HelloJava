
enum Enumday {
	Sunday, Monday(1), Tuesday(2, "화요일");
	private int position;
	private String dayString;
	Enumday() {
		position = 0;
		dayString = "일요일";
	}
	Enumday(int pos) {
		this.position = pos;
		this.dayString = "월요일";	
	}
	Enumday(int pos, String dayStr) {
		this(pos);
		this.dayString = dayStr;
	}
	public int getPosition() {
		return position;
	}
	public String getDayString() {
		return dayString;
	}
}
public class EnumConstructorTest {
	public static void main(String[] ar) {
		Enumday e0 = Enumday.Sunday;
		Enumday e1 = Enumday.Monday;
		Enumday e2 = Enumday.Tuesday;
		
		System.out.println(e0.getDayString());
		System.out.println(e1.getDayString());
		System.out.println(e2.getDayString());
		System.out.println(e0.getPosition());
		System.out.println(e1.getPosition());
		System.out.println(e2.getPosition());
	}
}
