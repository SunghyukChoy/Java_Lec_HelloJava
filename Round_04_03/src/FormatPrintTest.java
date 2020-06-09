
public class FormatPrintTest {
	public static void main(String[] args) {
		/* 실전형 #1 */
		String messageTemplate = "choi's score is %d";
		int score = 100;
		System.out.printf(messageTemplate, score);
		System.out.println();
		
		/* 실전형 #2 */
		String welcomeLoginMessage = "Welcome, Mr.%s! 오늘은 %s입니다";
		String loginName = "Choi";
		String weekday = "수요일";
		System.out.printf(welcomeLoginMessage, loginName, weekday);
		System.out.println();
		
		char a = 'A';
		System.out.printf("%c", a);
		System.out.printf("%c", 'A');
		System.out.println();
		System.out.printf("%5c", 'A');
		System.out.println();
		System.out.printf("%-5c", 'A');
		System.out.println();
		System.out.println("=========================");
		System.out.printf("%d", 12345);
		System.out.println();
		System.out.printf("%o", 12345);
		System.out.println();
		System.out.printf("%x", 12345);
		System.out.println();
		System.out.printf("%10d", 12345);
		System.out.println();
		System.out.printf("%010d", 12345);
		System.out.println();
		System.out.println("===========================");
		System.out.printf("%f", 12.12345f);
		System.out.println();
		System.out.printf("%g", 12.12345f);
		System.out.println();
		System.out.printf("%e", 12.12345f);
		System.out.println();
		System.out.printf("%-10.2f", 12.12345f);
		System.out.println();
		System.out.printf("%010.2f", 12.12345f);
		System.out.println();

	}
}
