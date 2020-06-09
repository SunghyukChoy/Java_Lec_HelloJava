package array;

public class ArrayWithFor {
	public static void main(String[] ar) {
		int[] iarray = new int[100];
		
		iarray[0] = 1;
		iarray[1] = 2;
		iarray[2] = 3;  // 끝까지 하나하나 입력하기 힘들어.
		
		for (int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1; // 배열에 값 지정.
		}
		
		int sum = 0; // sum이란 변수를 아래 for 블럭에서 선언 시 for 블럭 내에서밖에 사용 못함. 변수의 scope.
		for (int i = 0; i < iarray.length; i++) {
			
			sum = sum + iarray[i];
			
		}
		
		System.out.println(sum);
	}
}
