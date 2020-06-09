///////// 이해 안 됨

package array;

public class MergeTwoArray {
	public static void main(String[] args) {
		// 배열 생성
		int[] evens = { 10, 12, 14, 16, 18 };
		int[] odds = { 11, 13, 15, 17, 19 };

		// 배열 병합
		int[] result = merge(evens, odds);

		// 결과 출력
		System.out.printf("결과: ");
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}

	// 두 배열을 입력받아, 하나로 된 새 배열을 반환
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			// i 0 1 2
			mergedArr[2 * i] = arr1[i];      // arr1[i] 10 12 14
										     // 2*i     0 2 4
			mergedArr[2 * i + 1] = arr2[i]; // arr2[i]  11 13 15
											// 2*i+1    1 3 5
		}
		return mergedArr;
	}
}