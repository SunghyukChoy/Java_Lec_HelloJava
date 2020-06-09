
public class BusCard {
	public static void main(String[] ar) {
		card(10);
		card(17);
		card(21);
		card(3);

	}

	public static void card(int age) {
		String role = "";
		if (age > 20) {
			role = "성인";
		} else if (age > 13) {
			role = "청소년";
		} else if (age > 6) {
			role = "어린이";
		} else {
			role = "유아";
		}
		System.out.printf("%s(%d)입니다\n", role, age);
	}
}
