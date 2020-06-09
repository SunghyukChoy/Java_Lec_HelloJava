package array;

public class MergeThreeArray {
	public static void main(String[] args) {
		// 배열 생성
		int[] arr1 = { 10, 13, 16, 19 };
		int[] arr2 = { 11, 14, 17, 20 };
		int[] arr3 = { 12, 15, 18, 21 };

		// 배열 병합
		int[] result = merge(arr1, arr2, arr3);

		// 결과 출력
		System.out.printf("결과: ");
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}

	// 두 배열을 입력받아, 하나로 된 새 배열을 반환
	public static int[] merge(int[] arr1, int[] arr2, int[] arr3) {
		int[] mergedArr = new int[arr1.length + arr2.length + arr3.length];

		for (int i = 0; i < arr1.length; i++) {
//											// i 		0 	1 	2
//			mergedArr[2 * i] = arr1[i]; 	// arr1[i] 	10 	12 	14
//											// 2*i 		0 	2 	4
//			mergedArr[2 * i + 1] = arr2[i]; // arr2[i]	11 	13 	15
//											// 2*i+1 	1 	3 	5
			mergedArr[3 * i] = arr1[i];
			mergedArr[3 * i + 1] = arr2[i];
			mergedArr[3 * i + 2] = arr3[i];
			
		}
		return mergedArr;
	}
}
