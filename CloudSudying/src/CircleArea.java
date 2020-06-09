
public class CircleArea {
	public static void main(String[] ar) {
		int r = 4;
		double circlearea = area(r);
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f", r, circlearea);
	}
	
		public static double area(int r) {
			
			return Math.PI * r * r;
			
		}
}
