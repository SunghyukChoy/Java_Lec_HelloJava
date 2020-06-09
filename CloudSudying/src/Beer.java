import java.util.Scanner;

public class Beer {
	public static void order(int age) {
		if (age >= 20) {
			System.out.println("성인인증 및 캔맥주 구매 완료!");
		
	}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int age = 0;

		System.out.print("나이? = ");
		age = in.nextInt();

		order(age);
	}
}