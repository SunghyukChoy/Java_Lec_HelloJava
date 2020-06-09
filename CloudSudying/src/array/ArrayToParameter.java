package array;

public class ArrayToParameter {
	public static void main(String[] args) {
		// 배열 생성
		int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }; // 짝수
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 }; // 소수
		
		int[] oneToTwenty = new int[20];	// 210
		for (int i = 0; i < oneToTwenty.length; i++) {
			oneToTwenty[i] = i + 1;
			System.out.println(oneToTwenty[i]);
		}
		
		int[] threeToSeven = {3,4,5,6,7}; // 10
		
		System.out.println("Sum of even (1 to 20) : " + sumOfEvens(oneToTwenty));
		System.out.println("Sum of even (3 to 7) : " + sumOfEvens(threeToSeven));

		// 계산
		int evenSum = sum(evens);
		int primeSum = sum(primes);

		// 출력
		System.out.println("0 이상 20 미만의 짝수와 소수 중..");
		System.out.printf("짝수의 합: %d\n", evenSum);
		System.out.printf("소수의 합: %d\n", primeSum);
	}

	// 정수형 배열을 입력 받아 총합을 반환
	public static int sum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public static int sumOfEvens(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if (j % 2 == 0) {
				result += j;
			}
		}
		return result;
	}
}