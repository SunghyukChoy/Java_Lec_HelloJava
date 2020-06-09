package method;

public class CallMethod {
	public static void main(String[] ar) {
		int inputNum = 7;
		int resultNum = square(inputNum);
		System.out.printf("%d의 제곱값은 %d입니다", inputNum, resultNum);
	}

	public static int square(int x) {

		return x * x;
	}

}
