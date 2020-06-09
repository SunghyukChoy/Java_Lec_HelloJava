package method;

public class Pork {
	public static void main(String[] ar) {
		int n = 3;
		double kcal = cal(n);
		System.out.printf("삼겹살 %d인분의 칼로리 : %.2fkcal", n, kcal);
		
	}
	public static double cal(int n) {
		return n * 1.8 * 517.9;
	}
}
