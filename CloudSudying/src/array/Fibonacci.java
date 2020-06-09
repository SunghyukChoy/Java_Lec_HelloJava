// 안 풀어 봄

package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		// 배열 생성
		int[] fibo = new int[10];
		// 얘는 int이기 앞서 배열(Array)
		// 즉 기본형이 아님

		// 피보나치 배열 작성
		writeFibonacci(fibo);

		// 결과 출력
		printFibonacci(fibo);
		

	}

	/*
	 * Call By Reference -> 참조
	 * 기본형이 아닌 파라미터들은 모두 "참조" 형으로 넘어가서, 
	 * ****원본에도 영향을 준다****
	 * int[] 는 int 형이기 전에 배열(Array)형이다
	 */
	// 입력받은 정수형 배열을 피보나치 수열로 채움
	public static void writeFibonacci(int[] arr) {
		// 피보나치 배열 초기값 설정
		arr[0] = 0;
		arr[1] = 1;

		// 나머지 배열 작성
		for (int i = 2; i < arr.length; i++) {
			/* 1. 해당 반복문을 완성하세요. */
			arr[i] = arr[i - 1] + arr[i - 2];
			// arr[2] = arr[1] + arr[0];
		}
	}

	// 입력받은 정수형 배열을 출력
	public static void printFibonacci(int[] arr) {
		System.out.printf("피보나치 수열: [");
		for (int i = 0; i < arr.length; i++) {
			/* 2. 해당 반복문을 완성하세요. */
			System.out.print(" " + arr[i]);
			if (i != arr.length - 1) {
				System.out.print(",");
			}
		}
		
		System.out.printf(" ]");
		
		//System.out.println(Arrays.toString(arr)); // 간단한 코딩
	}
}