//이해 안 됨.

package array;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// 입력값 받기
		int number = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("숫자입력 = ");
		number = in.nextInt();

		// 결과 출력
		printFactorial(number);
	}

	// 정수 n을 입력받아 n!의 결과를 출력
	public static void printFactorial(int n) {
		long result = 0;
		System.out.printf("%d! = ", n);
		for (int i = n; i > 0; i--) {
			System.out.printf("%d", i);
			result *= i; // result = result * i
			if (i != 1) {
				System.out.printf(" x ");
			}
		}
		System.out.printf(" = %d\n", result);
	}
}