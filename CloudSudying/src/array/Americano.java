package array;

public class Americano {
	public static void main(String[] ar) {
		int[] arr = new int[7];
		
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 15;
		arr[4] = 9;
		arr[5] = 21; 
		arr[6] = 25;
		
		int sales = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6];
		System.out.printf("총 판매량 : %d 잔", sales);
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		} 
//		System.out.println(sum);
	} 
	
}
