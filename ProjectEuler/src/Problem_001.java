public class Problem_001 {
	public static void main(String[] ar) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}			
		}
		System.out.println("3 또는 5 배수의 총합 = " + sum);		
	}
}
