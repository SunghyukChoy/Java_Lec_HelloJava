import java.util.*;

public class WhileTest2 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("kor = ");
			int kor = in.nextInt();
			if (kor >= 0 && kor <= 100) {
				break;

			} else {
				System.out.println("kor 점수는 0에서 100");
			}

		}
		in.close();

	}
}
