public class Problem_0007 {
	public static void main(String[] ar) {
		int evens = 0;	int odds = 0;	int result = 0;
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				evens += i;
			}
		}
		for(int j = 0; j <= 10; j++) {
			if(j % 2 != 0) {
				odds += j;
			}
		}
		result = odds + evens;
		System.out.println("10까지의 자연수 중 홀수의 합 = " + odds);
		System.out.println("10까지의 자연수 중 짝수의 합 = " + evens);
		System.out.println("10까지의 자연수 중 짝수와 홀수의 합 = " + result);	
	}	
}