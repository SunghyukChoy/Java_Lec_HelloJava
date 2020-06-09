// 1부터 10까지의 합을 수식으로 나타내기
public class Problem_0001 {
	public static void main(String[] ar) {
		int sum = 0;		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (i != 10) { 
				System.out.println(i + " + ");
			}				
			if (i == 10) {
				System.out.println(i + " = " + sum);
			}			
		}
	}
}

