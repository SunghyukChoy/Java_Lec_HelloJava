// 큰수 비교 , 원둘레 구하기
import java.util.*;
public class MethodTest3 {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		System.out.println("first = ");
		int first = in.nextInt();
		System.out.println("second = ");
		int second = in.nextInt();

		int res = bigger(first, second);

		System.out.printf("%d와 %d 중에 큰 수는 %d입니다.", first, second, res);

		System.out.println();

		System.out.println("반지름 = ");
		int round = in.nextInt();

		double result = circleLength(round);

		System.out.printf("반지름 %d인 원의 둘레는 %.2f입니다.", round, result);
	}
	
	public static int bigger(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static double circleLength(int r) {
		double result = 2 * Math.PI * r;
		return result;
	}
}
