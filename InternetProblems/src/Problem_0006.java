
public class Problem_0006 {
	public static void main(String[] ar) {
		int[] num = {1,2,3,4,5};
		
		System.out.println("배열의 0번쨰와 1번째 의 합 = " + (num[0] + num[1]));
		System.out.println("배열 값들의 총합 = " + getSum(num));	
	}
	static int sum = 0;		//main() 메서드에서 호출하기 위해 static으로 선언.
	static int getSum(int[] arr) {	//main() 메서드에서 호출하기 위해 static으로 선언.
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} return sum;
	}	 
}
