
public class ComplexFormatPrintTers {
	public static void main(String[] args) {
		System.out.printf("%s\n", "최성혁");
		System.out.printf("%10s\n\n", "최성혁");

		String name = "최성혁";
		int age = 20;
		System.out.printf("%10s님의 나이는 %05d세 입니다. \n", name, age);
	}
}
