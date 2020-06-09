// 메서드 호출로 배열 합 구하기.
public class Problem_0003 {
	public static void main(String[] ar) {
		int[] ab = {1,2,3,4,5,6,7,8,9,10};
		int[] cd = {2,4,6,8,10};
		
		int absum = sum(ab);
		int cdsum = sum(cd);
		
		System.out.printf("1부터 10까지의 합 : %d\n", absum);
		System.out.printf("10 내의 짝수 합 : %d", cdsum);		
	}
	public static int sum(int[] arr) {
		int result = 0;
		for ( int i = 0; i < arr.length; i++) {
			result += arr[i];
		} return result;
	}		
}