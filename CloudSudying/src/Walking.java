
public class Walking {
	public static void main(String[] ar) {
		
		double walkcal = cal(5000);
		System.out.printf("소모 칼로리 : %.2fkcal", walkcal);
	}
	public static double cal(int walk) {
		return walk * 0.02;
	}
}
